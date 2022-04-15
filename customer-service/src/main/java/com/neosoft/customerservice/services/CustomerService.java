package com.neosoft.customerservice.services;

import java.util.List;

import com.neosoft.customerservice.dto.CustomerRequestDTO;
import com.neosoft.customerservice.dto.CustomerResponseDTO;

public interface CustomerService {
    CustomerResponseDTO getCustomer(String id);
    List<CustomerResponseDTO> getCustomers();
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    void deleteCustomer(String id);
}
