package Mas;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SqlCon {
	static Connection conn = null;
	
public static Connection dbConnector()
{
	try
	{
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:MandiDataBase.sqlite");
		
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null, "Connection unsuccessful!");
	}
	return conn;
}
}