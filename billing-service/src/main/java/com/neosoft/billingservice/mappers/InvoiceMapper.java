package com.neosoft.billingservice.mappers;

import org.mapstruct.Mapper;

import com.neosoft.billingservice.dto.InvoiceRequestDTO;
import com.neosoft.billingservice.dto.InvoiceResponseDTO;
import com.neosoft.billingservice.entities.Invoice;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceResponseDTO invoiceToInvoiceDTO(Invoice invoice);
    Invoice invoiceDTOtoInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
