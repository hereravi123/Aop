package com.sbms.service;

import java.util.List;

import com.sbms.entity.Product;

public interface IProductService {

	public String saveProduct(Product product);
	
	public List<Product> getAll();
	
	public String updateProduct(Product product);
	
	public String deleteById(Integer pId);
}
