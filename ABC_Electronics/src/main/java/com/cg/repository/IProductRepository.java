package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, String> {

}

