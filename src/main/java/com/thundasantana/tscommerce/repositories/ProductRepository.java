package com.thundasantana.tscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thundasantana.tscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
