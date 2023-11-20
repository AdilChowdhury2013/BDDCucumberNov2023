package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	Connection connection; //interface 1
	Statement statement;   //interface 2
	ResultSet resultSet;   //interface 3
	String columnValue;
	
	public String getDataFromDb(String columnName) {
	
		
		try {
			//set properties for mysql with the jdbc path from Dbeaver connection setting 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String sqlUrl= "jdbc:mysql://44.195.13.80:3306/april_2023";
			//String sqlUrl= "jdbc:mysql:// hostname+: port number+/databaseName";
			//jdbc:mysql://by default
			
			String sqlUserName= "student";
			String sqlPassword= "Student@123";
			String sqlQuery= "Select * from users";
			
			//create connection to the required database
			connection= DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
			
			//empower connection to the reference variable to execute queries 
			statement=connection.createStatement();
			
			//execute the queries
			resultSet=statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
			columnValue= resultSet.getString(columnName);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return columnValue;
		
	}
	 

}
