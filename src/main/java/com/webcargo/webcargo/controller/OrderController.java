package com.webcargo.webcargo.controller;

import com.webcargo.webcargo.entities.Order;
import com.webcargo.webcargo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/add")
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

    @GetMapping("/{id}")
    public Order readById(@PathVariable Long id) {
        return orderService.readById(id);
    }

    @GetMapping
    public List<Order> readAll() {
        return orderService.readAll();
    }

    @PutMapping("/{id}")
    public Order update(@RequestBody Order order, @PathVariable Long id) {
        return orderService.update(order, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        orderService.deleteById(id);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        orderService.deleteAll();
    }

}
