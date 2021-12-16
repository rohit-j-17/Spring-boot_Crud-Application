package com.rohit_crud.spring_boot_rohit_crud.controller;

import com.rohit_crud.spring_boot_rohit_crud.entity.product;
import com.rohit_crud.spring_boot_rohit_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
   public product addProduct(@RequestBody product product){
       return service.saveProduct(product);
   }
    @PostMapping("/addProducts")
    public List<product> addProducts(@RequestBody List<product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/Products")
    public List<product> findAll(){
        return service.getProducts();
    }
    @GetMapping("/Product/{id}")
    public product findById(@PathVariable int id){
        return  service.getProductById(id);
    }


}
