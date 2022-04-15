package com.neosoft.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.customerservice.entities.Customer;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
