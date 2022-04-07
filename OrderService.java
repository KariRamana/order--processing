package com.zensar.order.processing.service;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BusinessExpection;

public interface OrderService {
  boolean placeOrder(Order order) throws BusinessExpection;
  boolean CancleOrder(int orderId) throws BusinessExpection;
  boolean deleteOrder(int orderId) throws BusinessExpection;
}
