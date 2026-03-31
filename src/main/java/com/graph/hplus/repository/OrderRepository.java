package com.graph.hplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graph.hplus.data.Order;

public interface OrderRepository extends JpaRepository<Order, String>
{
}
