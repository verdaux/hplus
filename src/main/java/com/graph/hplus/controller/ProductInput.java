package com.graph.hplus.controller;

import com.graph.hplus.data.Product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductInput
{
	private String name;
	
	private int size;
	
	private String variety;

	private Float price;

	private String status;
	
	public Product getProductEntity()
	{
		Product product = new Product();
		product.setName(this.name);
		product.setSize(this.size);
		product.setVariety(this.variety);
		product.setPrice(this.price);
		product.setStatus(this.status);
		return product;
	}
}
