package com.graph.hplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graph.hplus.data.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long>
{
	List<Product> findProductByName(String name);
}
