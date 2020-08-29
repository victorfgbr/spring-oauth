package com.auth.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.authentication.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
