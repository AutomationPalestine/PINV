package com.pinv.qa.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabaseIntegrity {

	public static void main(String[] args) {
		DatabaseIntegrity id = new DatabaseIntegrity();

		String gpkey = null;
		String status = null;
		String substatus = null;
		// For oracle database
		id.getOracleDatabaseConnection(id.getOracleUpdateQuery(gpkey, status, substatus));

		// For SQL database
//		id.getSqlDatabaseConnection(id.getSqlUpdateQuery());
	}

	public String getOracleUpdateQuery(String gpkey, String status, String substatus) {
		return "UPDATE GPTRAN SET STATUS='" + status + "' , SUBSTATUS='" + substatus + "' WHERE "
				+ "(APPLICATIONTYPE||ENTRYYEAR||ENTRYMONTH||ENTRYDAY||RECORDTYPE||ENTRYPORT||TRANSESSION||TRANSEQUENCE||SUBSEQUENCE) = '"
				+ gpkey + "'";
	}

//	public void getOracleDatabaseConnection(String query) {
//		String dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
//		String username = "TNBC_EGPS_UAT";
//		String password = "secure";
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection connection = DriverManager.getConnection(dbURL, username, password);
//			Statement statement = connection.createStatement();
//			statement.executeUpdate(query);
//			statement.close();
//			connection.close();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//	}
	
	public int getOracleDatabaseConnection(String query) {
		int updated = 0;
		String dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		System.out.println("Query printed"+ query);
		String username = "PINV_EGPS_USER_UAT";
		String password = "secure";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			Statement statement = connection.createStatement();
			updated = statement.executeUpdate(query);
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return updated;
	}
	
	public String getparsedmsg() {
		return "select max(parsedmsgid) from gptran_parsedmessage";
	}

	public String getOracleUpdateQuery1(String gpkey, String tag, String tagValue) {
		return "update GPTRAN_PARSEDMESSAGE set tagValue = '" + tagValue + "' where tag = '" + tag
				+ "' and gptranid in (select gptranid from GPTRAN where"
				+ "(APPLICATIONTYPE||ENTRYYEAR||ENTRYMONTH||ENTRYDAY||RECORDTYPE||ENTRYPORT||TRANSESSION||TRANSEQUENCE||SUBSEQUENCE) = '"
				+ gpkey + "' )";
	}

	public String insertParsedMessage(String gpkey, String tag, String tagValue, long msgid, String dbid) {

		return "Insert into \r\n" + "GPTRAN_PARSEDMESSAGE \r\n"
				+ "(PARSEDMSGID,GPTRANID,TAG,CREATER,ERRORCODES,TAGTYPE,TAGVALUE,TAGORDER,ORDERSEQUENCE,LOOPLEVEL,LOOPNUMBER,\r\n"
				+ "LOOPOCCURRENCE,MODIFIED,SUBFIELD0,SUBFIELD1,SUBFIELD2,SUBFIELD3,SUBFIELD4,SUBFIELD5,SUBFIELD6,SUBFIELD7,\r\n"
				+ "SUBFIELD8,SUBFIELD9,SUBFIELD10,LINKIDMARKER,PARTDATEKEY,PARTYID,AMOUNTID,REFERENCEID,NARRATIVEID) \r\n"
				+ "values \r\n" + "(" + msgid + "," + dbid
				+ ",'PREVIOUSSTATUS',null,null,'FIELD','QueuedToAccountVerification',0,53,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null)";
	}

	public String insertParsedMessage1(String gpkey, String tag, String tagValue, long msgid, String dbid) {

		return "Insert into \r\n" + "GPTRAN_PARSEDMESSAGE \r\n"
				+ "(PARSEDMSGID,GPTRANID,TAG,CREATER,ERRORCODES,TAGTYPE,TAGVALUE,TAGORDER,ORDERSEQUENCE,LOOPLEVEL,LOOPNUMBER,\r\n"
				+ "LOOPOCCURRENCE,MODIFIED,SUBFIELD0,SUBFIELD1,SUBFIELD2,SUBFIELD3,SUBFIELD4,SUBFIELD5,SUBFIELD6,SUBFIELD7,\r\n"
				+ "SUBFIELD8,SUBFIELD9,SUBFIELD10,LINKIDMARKER,PARTDATEKEY,PARTYID,AMOUNTID,REFERENCEID,NARRATIVEID) \r\n"
				+ "values \r\n" + "(" + msgid + "," + dbid
				+ ",'INITPOSTING_FAILURE_ERROR_MSG',null,null,'FIELD','INSUFFICIENT AVAILABLE BALA FOR TRANSACT',0,53,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null)";
	}//end of insertParsedMessageOne function

	public long getOracleDatabaseConnectionForSelectParseMsgId(String query) {
		long execute = 0;
		String dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		System.out.println("Query printed" + query);
		String username = "PINV_EGPS_USER_UAT";
		String password = "secure";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				execute = rs.getLong("max(parsedmsgid)");
			}
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return execute;
	}

//	public String getSqlUpdateQuery() {
//		return "UPDATE GPTRAN SET STATUS='QueuedToOutPresentCheque' , SUBSTATUS=null WHERE "
//				+ "CONCAT(APPLICATIONTYPE,ENTRYYEAR,ENTRYMONTH,ENTRYDAY,RECORDTYPE,ENTRYPORT,TRANSESSION,TRANSEQUENCE,SUBSEQUENCE) = 'GP20200526MQ00IU00000000'";
//	}

//	public void getSqlDatabaseConnection(String query) {
//		String dbURL = "jdbc:jtds:sqlServer://127.0.0.1;databaseName=ALDN_BANK_EGPS";
//		String username = "sa64";
//		String password = "secure";
//		try {
//			Class.forName("net.sourceforge.jtds.jdbc.Driver");
//			Connection connection = DriverManager.getConnection(dbURL, username, password);
//			Statement statement = connection.createStatement();
//			statement.executeUpdate(query);
//			statement.close();
//			connection.close();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//	}

	public String updatePaymentstatus() {
		return "update CHEQUE_DETAIL_TABLE set exportType= 'EXPORT_CHEQUE' , source='CLIENT_SCANNER' , "
				+ "senderUserName = 'ADMIN/admin1' where source = 'PDC_MIGRATION'";
	}
	
	public String updateIsraeliPaymentstatus() {
		return "update CHEQUE_DETAIL_TABLE set exportType= 'EXPORT_CHEQUE' , source='CLIENT_SCANNER' , "
				+ "senderUserName = 'ADMIN/admin1' where source = 'ISRAELI_PDC_MIGRATION'";
	}

	public String updationforOnusBatchpayment() {
		return "update DEPOSIT_SLIP_BEAN set depositeType = 'ONUS' where depositeID = 1;"
				+ "update BATCH_CHEQUE_BEAN set beneficiaryBankCode = '27' ,"
				+ " beneficiaryBranchCode = '001' , payerBankCode = '27' , payerBranchCode = '001' "
				+ "where depositeID = 1";
	}
}
