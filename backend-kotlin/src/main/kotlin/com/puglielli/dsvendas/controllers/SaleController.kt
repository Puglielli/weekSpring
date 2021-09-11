package com.puglielli.dsvenda.controllers

import com.puglielli.dsvenda.service.SaleService
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/sales"])
class SaleController(private val service: SaleService) {

    @GetMapping
    fun findAll(pageable: Pageable) = ok(service.findAll(pageable))

    @GetMapping(value = ["/amount-by-seller"])
    fun amountGroupedBySeller() = ok(service.amountGroupedBySeller())

    @GetMapping(value = ["/success-by-seller"])
    fun successGroupedBySeller() = ok(service.successGroupedBySeller())
}
