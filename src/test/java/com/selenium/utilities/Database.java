package com.selenium.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
public void sqlconnection() throws SQLException
{
	Connection con = DriverManager.getConnection(" ", " ", " ");
	Statement stmt = con.createStatement();	
	stmt.executeQuery("select *  from employee");
}

}
