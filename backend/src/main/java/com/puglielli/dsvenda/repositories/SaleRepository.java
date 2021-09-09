package com.puglielli.dsvenda.repositories;

import com.puglielli.dsvenda.entities.Sale;
import com.puglielli.dsvenda.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {}
