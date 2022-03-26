package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class ProductImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;


    @Override
    public Iterable<Product> findAllByCatag(Long idC) {
        return productRepo.view(idC);
    }


}
