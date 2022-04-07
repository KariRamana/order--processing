package com.zensar.order.processing.service;

import java.sql.SQLException;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BusinessExpection;
import com.zensar.order.processing.repository.OrderRepository;

public class OrderServiceImp implements OrderService {
	private OrderRepository orderRepository;
	

	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public boolean placeOrder(Order order) throws BusinessExpection {
		try {
			int result=orderRepository.create(order);
			if(result==0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BusinessExpection(e);
		} 
		return true;
	}

	@Override
	public boolean CancleOrder(int orderId) throws BusinessExpection {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(int orderId) throws BusinessExpection {
		// TODO Auto-generated method stub
		return false;
	}

}
