package com.know.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.know.demo.entities.OrderItem;
import com.know.demo.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
