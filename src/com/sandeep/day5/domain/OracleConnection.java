package com.sandeep.day5.domain;

public class OracleConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("successfully connected to Oracle database");

	}

	@Override
	public void displayDatabaseInfo() {
		System.out.println("oracle database 12c version.");

	}

}
