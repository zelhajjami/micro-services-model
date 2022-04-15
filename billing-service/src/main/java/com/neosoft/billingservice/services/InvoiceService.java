package com.neosoft.billingservice.services;

import java.util.List;

import com.neosoft.billingservice.dto.InvoiceRequestDTO;
import com.neosoft.billingservice.dto.InvoiceResponseDTO;

public interface InvoiceService {
 InvoiceResponseDTO getInvoice(String id);
 List<InvoiceResponseDTO> listInvoices();
 InvoiceResponseDTO newInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
