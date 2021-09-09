package com.puglielli.dsvenda.service;

import com.puglielli.dsvenda.dto.SellerDTO;
import com.puglielli.dsvenda.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    SellerRepository repository;

    public List<SellerDTO> findAll() {
        return repository.findAll().stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
