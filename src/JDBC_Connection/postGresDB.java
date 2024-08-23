package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class postGresDB {
//	static String url;
//	static String username;
//	static String password;
	
	static HashMap <String ,Object> session=new HashMap<String,Object>();
	public static void setSessionVariables(String k,Object v) {
		
			session.put(k, v);
		
	}
	
	public static String getSessionVaribles(String k) {
		String dbValue = null;
		Object value=session.get(k);
		if(value!=null) {
			 dbValue=value.toString();
		}
		return dbValue;
	}
	
	 public static void getPostGresConnection() throws JsonProcessingException {
		 
		 
		 
		 
		 String dburl=getSessionVaribles("url");	 
	     String dbusername =getSessionVaribles("username");
		 String dbpassword= getSessionVaribles("password");
		

	     HashMap <Integer,HashMap<String,Object>> tabledata=new HashMap<Integer,HashMap<String,Object>>();
		 try {
		     Connection connection = DriverManager.getConnection(dburl, dbusername, dbpassword);
		   
		     
		     // Example query execution
		     Statement statement = connection.createStatement();
		     ResultSet resultSet = statement.executeQuery("SELECT * FROM faultmutedetail");
		     System.out.println(resultSet);
		     
		     int rowcount=0;
		     while (resultSet.next()) {  /// iterating row one by one 
		    	HashMap<String,Object> currentRowdetails=new HashMap<String,Object>();
		    	
		    	for(int i=1; i<resultSet.getMetaData().getColumnCount(); i++ ) {
		    		String columnName=resultSet.getMetaData().getColumnName(i); // capturing column name index wise 
		    		Object cellValue=resultSet.getObject(i); //  capturing cell values first column, first cell value
		    		currentRowdetails.put(columnName, cellValue); // set column name= value  index first 
		    		                                              //  loop start again for index 2 means column 2 
		    	}
		    	tabledata.put(rowcount, currentRowdetails);   // adding all column with first cell value at line no 0 , while loop continue....
	    		rowcount++;
		    	
		    	 
		     }
		     
		     
//			 for(Entry<Integer, HashMap<String, Object>> Entry :tabledata.entrySet()) {   // Printing tabledata here
//				 System.out.println(Entry.getKey()+":"+Entry.getValue());
//			 }
		    // String jsonResult=tabledata.toString();
		    // System.out.println(jsonResult);
			 ObjectMapper objectmapper = new ObjectMapper();
			 String json=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(tabledata);
			 System.out.println(json);
//		     resultSet.close();
//		     statement.close();
//		     connection.close();
		 } catch (SQLException e) {
		     e.printStackTrace();
		 }
		
		 
	 }
	
	public static void main(String[] args) throws SQLException, JsonProcessingException {
		
		setSessionVariables("url","jdbc:postgresql://172.20.247.71:30333/obemqa-entityapi-OBEM_SIT_4.5_Org-db");
		setSessionVariables("username","obemapprouser");
		setSessionVariables("password","zfbpUY2EE4TjIcgacp4aephB");
		
		getPostGresConnection();
				
				
	 

	 
	}

}
