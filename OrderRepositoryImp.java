package com.zensar.order.processing.repository;

import java.sql.SQLException;

import com.zensar.order.processing.entity.Order;

public class OrderRepositoryImp implements OrderRepository {

	@Override
	public int create(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Order read(int orderId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Update(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int delete(int orderId) throws SQLException {
		// TODO Auto-generated method stub
		return 1;
	}

}
