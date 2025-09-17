package com.mtd.EcomApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtd.EcomApp.entity.product;

public interface Productrepository extends MongoRepository<product,String>{

}
