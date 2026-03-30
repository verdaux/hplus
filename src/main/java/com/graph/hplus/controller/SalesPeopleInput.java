package com.graph.hplus.controller;

import com.graph.hplus.data.Salespeople;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SalesPeopleInput
{
	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private String address;

	private String city;

	private String state;

	private String zipCode;
	
	public Salespeople getSalesPeopleEntity()
	{
		Salespeople salesPeople = new Salespeople();
		salesPeople.setFirstName(this.firstName);
		salesPeople.setLastName(this.lastName);
		salesPeople.setEmail(this.email);
		salesPeople.setPhone(this.phone);
		salesPeople.setAddress(this.address);
		salesPeople.setCity(this.city);
		salesPeople.setState(this.state);
		salesPeople.setZipCode(this.zipCode);
		return salesPeople;
	}
}
