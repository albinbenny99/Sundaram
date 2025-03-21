package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired  
    private ProductService productService;

    // GET: Retrieve a product by ID
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // POST: Add a new product
    @PostMapping("/product")
    public String addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return "Product added successfully!";
    }

    // PUT: Update a product by ID
    @PutMapping("/product/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
        productService.updateProduct(id, product);
        return "Product updated successfully!";
    }

    // DELETE: Delete a product by ID
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product deleted successfully!";
    }
}
