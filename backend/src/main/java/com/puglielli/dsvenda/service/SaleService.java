package com.puglielli.dsvenda.service;

import com.puglielli.dsvenda.dto.SaleDTO;
import com.puglielli.dsvenda.repositories.SaleRepository;
import com.puglielli.dsvenda.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        return saleRepository.findAll(pageable).map(SaleDTO::new);
    }
}
