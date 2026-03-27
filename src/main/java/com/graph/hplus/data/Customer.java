package com.graph.hplus.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer
{
/*
 *     CUSTOMER_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    FIRST_NAME VARCHAR(64),
    LAST_NAME VARCHAR(64),
    EMAIL VARCHAR(128) UNIQUE,
    PHONE VARCHAR(32),
    ADDRESS VARCHAR(256),
    CITY VARCHAR(64),
    STATE CHAR(2),
    ZIPCODE VARCHAR(12)
 * */
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ZIPCODE")
	private String zipCode;
	
}
