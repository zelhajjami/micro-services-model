package com.neosoft.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.neosoft.customerservice.entities.Customer;
import com.neosoft.customerservice.repositories.CustomerRepository;

import java.util.UUID;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer("001","neo","med@neosoft.com"));
            customerRepository.save(new Customer("002","LinkedIn","linked@neosoft.com"));
        };
    }

}
