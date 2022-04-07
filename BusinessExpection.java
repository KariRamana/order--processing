package com.zensar.order.processing.exception;

import java.sql.SQLException;

public class BusinessExpection extends Exception {

	public BusinessExpection(SQLException e) {
		super(e);
	}

}
