package com.neosoft.billingservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.neosoft.billingservice.dto.InvoiceRequestDTO;
import com.neosoft.billingservice.services.InvoiceService;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(InvoiceService invoiceService){
        return args -> {
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(8700),"001"));
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(5400),"001"));
        };
    }
}
