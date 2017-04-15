package Sql_Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_MySql {
	private static  String url = "jdbc:mysql://localhost:3306/UserDB";
	private static  String user ;
	private static  String password ;
	private static  java.sql.Connection connectoin;
	private static Statement stmt;
	
	
	/*private static  String name_BD  = "db";
	
	public static String getName_BD() {
		return name_BD;
	}*/

	public Connection_MySql() {
		
	}
    
	public Connection_MySql(String user, String password) {
	
		this.user = user;
		this.password = password;
		
	}
	
	public Statement connection_start(){
			
		try{
		
			connectoin = DriverManager.getConnection(url,user,password);
			stmt = connectoin.createStatement();
		
		} 
		catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		return stmt; 
	 }
	
	public void close_connection(){
		
		try { connectoin.close();}catch (SQLException se){System.out.println("first exeption");}
		try { stmt.close();} catch (SQLException se) {System.out.println("second ex");	}
	    
	}

}
