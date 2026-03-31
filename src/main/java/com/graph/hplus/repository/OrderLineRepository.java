package com.graph.hplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graph.hplus.data.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long>
{
}
