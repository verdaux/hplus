package com.graph.hplus.controller;

import com.graph.hplus.data.Customer;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerInput
{
	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private String address;

	private String city;

	private String state;

	private String zipCode;
	
	public Customer getCustomerEntity()
	{
		Customer customer = new Customer();
		customer.setFirstName(this.firstName);
		customer.setLastName(this.lastName);
		customer.setEmail(this.email);
		customer.setPhone(this.phone);
		customer.setAddress(this.address);
		customer.setCity(this.city);
		customer.setState(this.state);
		customer.setZipCode(this.zipCode);
		return customer;
	}
}
