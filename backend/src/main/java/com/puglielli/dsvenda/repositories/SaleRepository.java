package com.puglielli.dsvenda.repositories;

import com.puglielli.dsvenda.dto.SaleSuccessDTO;
import com.puglielli.dsvenda.dto.SaleSumDTO;
import com.puglielli.dsvenda.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT NEW com.puglielli.dsvenda.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT NEW com.puglielli.dsvenda.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
