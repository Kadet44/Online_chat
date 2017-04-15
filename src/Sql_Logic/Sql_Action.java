package Sql_Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sql_Action {
	private Statement stat;
	//private String name_bd = Connection_MySql.getName_BD();
	
	public Sql_Action (Statement stat) {
	this.stat = stat;
	}
	



	public String getName() {
		try {
			ResultSet name = stat.executeQuery("SELECT login FROM User;");
			while (name.next()){
				System.out.println(name.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}



	
	public void addUser(int id , String login, String Password) {
		try {
			System.out.println("INSERT INTO User (id, login, password) VALUES (" + id+",'"+ login+"','"+Password+"');");
			stat.executeUpdate("INSERT INTO User (id, login, password) VALUES (" + id+",'"+ login+"','"+Password+"');");
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
	}

	

}
