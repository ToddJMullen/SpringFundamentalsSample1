package com.ps.repository;

import java.util.List;

import com.ps.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}