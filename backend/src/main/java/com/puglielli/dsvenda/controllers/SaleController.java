package com.puglielli.dsvenda.controllers;

import com.puglielli.dsvenda.dto.SaleDTO;
import com.puglielli.dsvenda.dto.SaleSuccessDTO;
import com.puglielli.dsvenda.dto.SaleSumDTO;
import com.puglielli.dsvenda.dto.SellerDTO;
import com.puglielli.dsvenda.entities.Sale;
import com.puglielli.dsvenda.service.SaleService;
import com.puglielli.dsvenda.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.ResponseEntity.ok;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        return ok(service.findAll(pageable));
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        return ok(service.amountGroupedBySeller());
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        return ok(service.successGroupedBySeller());
    }
}
