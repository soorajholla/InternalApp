package com.internal.wines.utils;
import static com.internal.wines.utils.Provider.*;

import java.sql.*;

public class ConnectionProvider {
	static Connection con=null;
	static{
		try{
			Class.forName(DRIVER);
			String conStr = "jdbc:sqlserver://awssqlserverdb.cicjifjvhiws.us-east-2.rds.amazonaws.com:1433;database=winestoredb;user=admin1;password=Test1234;";
			con=DriverManager.getConnection(conStr);
			}catch(SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
	}
	public static Connection getCon(){
		return con;
	}
}
