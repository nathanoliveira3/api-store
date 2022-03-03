package com.project.store.repositories;

import com.project.store.entities.OrderItem;
import com.project.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
