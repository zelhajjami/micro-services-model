package com.neosoft.billingservice.webapi;
import org.springframework.web.bind.annotation.*;

import com.neosoft.billingservice.dto.InvoiceRequestDTO;
import com.neosoft.billingservice.dto.InvoiceResponseDTO;
import com.neosoft.billingservice.services.InvoiceService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class InvoiceRestAPI {
    private InvoiceService invoiceService;

    public InvoiceRestAPI(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> invoices(){
        return invoiceService.listInvoices();
    }
    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO invoice(@PathVariable String id){
        return invoiceService.getInvoice(id);
    }
    @PostMapping(path="/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiceService.newInvoice(invoiceRequestDTO);
    }
}
