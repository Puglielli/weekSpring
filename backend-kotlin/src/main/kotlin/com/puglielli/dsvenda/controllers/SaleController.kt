package com.puglielli.dsvenda.controllers

import com.puglielli.dsvenda.service.SellerService
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/sellers"])
class SellerController(private val service: SellerService) {

    @GetMapping
    fun findAll() = ok(service.findAll())
}
