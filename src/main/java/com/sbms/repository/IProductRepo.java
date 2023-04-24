package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
