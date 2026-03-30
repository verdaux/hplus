package com.graph.hplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graph.hplus.data.Salespeople;

@Repository
public interface SalespeopleRepository extends JpaRepository<Salespeople, Long>
{
	Salespeople findSalesPeopleByEmail(String email);
}
