package com.graph.hplus.controller;

import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graph.hplus.data.Salespeople;
import com.graph.hplus.repository.SalespeopleRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SalespeopleController
{
	private final SalespeopleRepository salesPeopleRepository;
	@QueryMapping
	public Iterable<Salespeople> salespeople()
	{
		return this.salesPeopleRepository.findAll();
	}
	
	@QueryMapping
	public Optional<Salespeople> salespeopleById(@Argument Long id)
	{
		return this.salesPeopleRepository.findById(id);
	}
	
	@QueryMapping
	public Salespeople salespeopleByEmail(@Argument String email)
	{
		return this.salesPeopleRepository.findSalesPeopleByEmail(email);
	}
	
	@MutationMapping
	public Salespeople addSalesPeople(@Argument(name = "input") SalesPeopleInput SalesPeopleInput)
	{
		return this.salesPeopleRepository.save(SalesPeopleInput.getSalesPeopleEntity());
	}
}
