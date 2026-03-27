package com.graph.hplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graph.hplus.data.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
	Customer findCustomerByEmail(String email);
}
