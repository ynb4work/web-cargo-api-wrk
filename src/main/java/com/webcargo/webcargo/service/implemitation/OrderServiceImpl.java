package com.webcargo.webcargo.service.implemitation;

import com.webcargo.webcargo.entities.Order;

import java.util.List;

public interface OrderServiceImpl {

    // CRUD operations

    Order create(Order order);

    Order readById(Long id);

    List<Order> readAll();

    Order update(Order order, Long id);

    void deleteById(Long id);

    void deleteAll();

}