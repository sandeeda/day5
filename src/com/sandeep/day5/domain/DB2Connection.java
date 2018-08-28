package com.sandeep.day5.domain;

public class DB2Connection implements Connection {

	@Override
	public void connect() {
		System.out.println("successfully connected to DB2 database");

	}

	@Override
	public void displayDatabaseInfo() {
		System.out.println("IBM DB2 database.");

	}

}
