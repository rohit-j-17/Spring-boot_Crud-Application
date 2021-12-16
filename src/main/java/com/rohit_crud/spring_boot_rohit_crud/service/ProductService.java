package com.rohit_crud.spring_boot_rohit_crud.service;

import com.rohit_crud.spring_boot_rohit_crud.entity.product;
import com.rohit_crud.spring_boot_rohit_crud.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

  public product saveProduct(product product){
      return repository.save(product);

  }
  // for list of products
    public List<product> saveProducts(List<product> products){
        return repository.saveAll(products);

    }
    public List<product> getProducts(){
      return repository.findAll();
    }

    public product getProductById(int id){
        return repository.findById(id).orElse(null);
    }






}
