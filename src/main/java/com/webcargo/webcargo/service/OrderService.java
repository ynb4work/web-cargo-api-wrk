package com.webcargo.webcargo.service;

import com.webcargo.webcargo.entities.Order;
import com.webcargo.webcargo.repository.OrderRepository;
import com.webcargo.webcargo.service.implemitation.OrderServiceImpl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements OrderServiceImpl {

    private final OrderRepository orderRepository;

    @Override
    public Order create(Order person) {

        return orderRepository.save(person);
    }

    @Override
    public Order readById(Long id) {

        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
    }

    @Override
    public List<Order> readAll() {

        return orderRepository.findAll();
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
