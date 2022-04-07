package com.zensar.order.processing.repository;

import java.sql.SQLException;

import com.zensar.order.processing.entity.Order;

public interface OrderRepository {
	public abstract int create(Order order) throws SQLException;
	Order read(int orderId) throws SQLException;
	int Update(Order order) throws SQLException;
	int delete(int orderId) throws SQLException;

}
