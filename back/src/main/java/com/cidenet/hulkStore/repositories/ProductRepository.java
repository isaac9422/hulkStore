package com.cidenet.hulkStore.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cidenet.hulkStore.domains.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, UUID> {

}
