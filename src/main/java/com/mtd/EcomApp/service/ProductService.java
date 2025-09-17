package com.mtd.EcomApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtd.EcomApp.entity.product;
import com.mtd.EcomApp.repository.Productrepository;

@Service

public class ProductService {
	@Autowired
	private Productrepository productRepository;
	//save
	public product saveproduct(product product) {
		product.setId(null);
		return productRepository.save(product);
		
	}
	//get id
	
	public product getproductById(String id) {
		return productRepository.findById(id).get();
	}
	public List<product> getproduct(){
		return productRepository.findAll();
	}
	//delete product
	public boolean deleteproduct(String id) {
		Optional<product>product=productRepository.findById(id);
		if(product.isEmpty()) {
			return false;
		}
		productRepository.deleteById(id);
		return true;
		
	}
	public product updateproduct(product product,String id) {
		product exisitingproduct=productRepository.findById(id).get();
		exisitingproduct.setName(product.getName());
		exisitingproduct.setDescription(product.getDescription());
		exisitingproduct.setPrice(product.getPrice());
		exisitingproduct.setStock(product.getStock());
		exisitingproduct.setTags(product.getTags());
		exisitingproduct.setCategory(product.getCategory());
		return productRepository.save(exisitingproduct);
		
	}

}
