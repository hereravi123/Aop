package com.sbms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.Product;
import com.sbms.repository.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductRepo repo;
	

	@Override
	public String saveProduct(Product product) {
		repo.save(product);
		return "saved product";
	}

	@Override
	public List<Product> getAll() {
		
		return repo.findAll();
		
		
	}

	@Override
	public String updateProduct(Product product) {
		if(repo.existsById(product.getPId()))
			repo.save(product);
		// TODO Auto-generated method stub
		return "new product saved";
	}

	@Override
	public String deleteById(Integer pId) {
		repo.deleteById(pId);
		return"delete product";
	}

}
