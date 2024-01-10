package com.webcargo.webcargo.service;

import com.webcargo.entities.Order;
import com.webcargo.repository.OrderRepository;
import com.webcargo.service.implemitation.OrderServiceImpl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements OrderServiceImpl {

    private final OrderRepository orderRepository;

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order readById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
    }

    @Override
    public List<Order> readAll() {
        List<Order> orders = orderRepository.findAll();
        Collections.reverse(orders); // Изменение порядка на обратный
        return orders;
    }

    @Override
    @Transactional
    public Order update(Order order, Long id) {
        order = orderRepository.findById(id).orElseThrow();
        order.setId(id);
        return orderRepository.save(order);
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        orderRepository.deleteAll();
    }
}
