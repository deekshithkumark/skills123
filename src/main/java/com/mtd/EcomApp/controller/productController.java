package com.mtd.EcomApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtd.EcomApp.entity.product;
import com.mtd.EcomApp.service.ProductService;
@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class productController {
@Autowired
private ProductService productService;
@PostMapping("/save")
public product save(@RequestBody product product) {
	return productService.saveproduct(product);
}
@GetMapping("/{id}")
public product findById(@PathVariable String id) {
	return productService.getproductById(id);
}
@GetMapping("/all")
public List<product> findAll(){
	return productService.getproduct();
}
@PutMapping("/id")
public product updateProduct(@RequestBody product product ,@PathVariable String id) {
	return productService.updateproduct(product,id);
}
@DeleteMapping("/{id}")
public boolean deleteproduct(String id) {
	return productService.deleteproduct(id);
}

	
}
