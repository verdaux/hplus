package com.graph.hplus.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
	@Id
	@Column(name = "PRODUCT_ID")
	private String id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SIZE")
	private Integer size;
	
	@Column(name = "VARIETY")
	private String variety;
	
	@Column(name = "PRICE")
	private Float price;
	
	@Column(name = "STATUS")
	private String status;
}
