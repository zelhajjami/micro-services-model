package com.neosoft.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.billingservice.entities.Invoice;

import java.util.UUID;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {
}
