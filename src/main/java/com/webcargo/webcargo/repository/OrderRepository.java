package com.webcargo.webcargo.repository;

import com.webcargo.webcargo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}