package com.graph.hplus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graph.hplus.data.Product;
import com.graph.hplus.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController
{
	private final ProductRepository productRepository;
	
	@QueryMapping
	public Iterable<Product> products()
	{
		return this.productRepository.findAll();
	}
	
	@QueryMapping
	public Optional<Product> productById(@Argument Long id)
	{
		return this.productRepository.findById(id);
	}
	
	@QueryMapping
	public List<Product> productByName(@Argument String name)
	{
		return this.productRepository.findProductByName(name);
	}
	
	@MutationMapping
	public Product addProduct(@Argument(name = "input") ProductInput productInput)
	{
		return this.productRepository.save(productInput.getProductEntity());
	}
}
