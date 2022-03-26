package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin("*")
@RequestMapping("api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/view")
    public ResponseEntity<Iterable<Product>> view(@RequestParam String tag) {
        Optional<Category> category=categoryService.findByTag(tag);
        Long idC =  category.get().getId();
        Iterable<Product> products = productService.findAllByCatag(idC);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
