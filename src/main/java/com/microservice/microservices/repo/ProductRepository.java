package com.microservice.microservices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.microservices.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
