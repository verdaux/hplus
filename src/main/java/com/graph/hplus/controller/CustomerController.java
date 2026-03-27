package com.graph.hplus.controller;

import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graph.hplus.data.Customer;
import com.graph.hplus.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CustomerController
{
	
	private final CustomerRepository customerRepository;

	@QueryMapping
	public Iterable<Customer> customers()
	{
		return this.customerRepository.findAll();
	}
	
	@QueryMapping
	public Optional<Customer> customerById(@Argument Long id)
	{
		return this.customerRepository.findById(id);
	}
	
	@QueryMapping
	public Customer customerByEmail(@Argument String email)
	{
		return this.customerRepository.findCustomerByEmail(email);
	}
}
