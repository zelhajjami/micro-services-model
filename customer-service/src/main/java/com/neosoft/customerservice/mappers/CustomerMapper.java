package com.neosoft.customerservice.mappers;

import org.mapstruct.Mapper;

import com.neosoft.customerservice.dto.CustomerRequestDTO;
import com.neosoft.customerservice.dto.CustomerResponseDTO;
import com.neosoft.customerservice.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerDTO(Customer customer);
    Customer customerRequestDtoToCustomer(CustomerRequestDTO customerRequestDTO);
}
