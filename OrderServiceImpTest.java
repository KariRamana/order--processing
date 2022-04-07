package com.zensar.order.processing.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BusinessExpection;
import com.zensar.order.processing.repository.OrderRepository;

public class OrderServiceImpTest {
	private OrderServiceImp imp;
	@Mock
	private OrderRepository Repository;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		imp = new OrderServiceImp();
		imp.setOrderRepository(Repository);
	}

	@Test
	public void placeorder_should_create_an_order() throws BusinessExpection {

		Order order = new Order();
		try {
		when(Repository.create(order)).thenReturn(1);
		boolean placeorder = imp.placeOrder(order);
		assertTrue(placeorder);
System.out.println(verify(Repository,atLeast(1)).create(order));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void placeorder_should_not_create_an_order() throws BusinessExpection {
		Order order = new Order();
		try {
			when(Repository.create(order)).thenReturn(0);
			boolean result = imp.placeOrder(order);
			assertFalse(result);
			System.out.println(verify(Repository).create(order));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test(expected=BusinessExpection.class)
	public void place_order_should_throw_business_exception() throws SQLException,BusinessExpection {
		Order order=new Order();
		try {
			when(Repository.create(any(Order.class))).thenThrow(SQLException.class);
			boolean PlaceOrder = imp.placeOrder(order);
			assertFalse(PlaceOrder);
			System.out.println(verify(Repository).create(order));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
