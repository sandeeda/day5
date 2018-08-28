package com.sandeep.day5.domain;

public class MySQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("successfully connected to MySQL database.");

	}

	@Override
	public void displayDatabaseInfo() {
		System.out.println("MySQL database version 7");

	}

}
