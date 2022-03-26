package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query(value = "select * from product where category_tag_id = :idC order by price desc,lower(name) asc ",nativeQuery = true)
    Iterable<Product> view(@Param("idC") Long idC);
}
