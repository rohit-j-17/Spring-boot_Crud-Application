package com.rohit_crud.spring_boot_rohit_crud.repo;

import com.rohit_crud.spring_boot_rohit_crud.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product,Integer> {
}
