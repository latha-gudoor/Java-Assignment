// Write a program to make use of JDBC and insert/update/select values in the database.



/* i just copied this programs--- i just got an idea with this program... 
 * and i remember for establishing the connection,first database which we want to use 
 * shoulb be up and running and we need the host name and after establishing the 
 * connection we need to perform operations using sql queries.
 * 
 * if you possible please send me the steps to be followed for JDBC   */
package generalPrograms;


	//STEP 1. Import required packages
	import java.sql.*;

	public class JDBCExample {
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

	   //  Database credentials
	   static final String USER = "username";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample
	


