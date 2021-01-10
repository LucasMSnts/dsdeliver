package com.lucasms.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasms.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
