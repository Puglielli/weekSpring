package com.puglielli.dsvenda.entities

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tb_sales")
data class Sale(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long,
    val visited: Int,
    val deals: Int,
    val amount: Double,
    val date: LocalDate,

    @ManyToOne
    @JoinColumn(name = "seller_id")
    val seller: Seller
)
