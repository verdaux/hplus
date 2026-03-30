package com.graph.hplus.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDER_LINES")
public class OrderLine
{
	@Id
	@Column(name = "ORDER_LINE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ORDER_ID", nullable = false, updatable = false)
	private Order order;
	
	@Column(name = "QUANTITY")
	private int quantity;
}
