package com.sandeep.day5.domain;
import com.sandeep.day5.domain.Connection;
import com.sandeep.day5.domain.OracleConnection;
public class ConnectionClient {

	public static void main(String[] args) {
		//connectToDatabase(new MySQLConnection());
				connectToDatabase(new OracleConnection());
			}
			
			public static void connectToDatabase(Connection connection) {
				connection.connect();
				connection.displayDatabaseInfo();
			}
	}


