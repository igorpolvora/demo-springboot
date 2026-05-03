package com.know.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.know.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
