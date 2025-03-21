package com.example.demo.Service;

import com.example.demo.model.Product;
import com.example.demo.Exception.ProductNotFoundException;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private final Map<Integer, Product> productDatabase = new HashMap<>();
    private int nextId = 1;

    // Create or Save Product
    public Product createProduct(String name, int quantity) {
        Product product = new Product(nextId++, name, quantity);
        productDatabase.put(product.getId(), product);
        return product;
    }

    public void saveProduct(Product product) {
        product.setId(nextId++);
        productDatabase.put(product.getId(), product);
    }

    // Get Product by ID
    public Product getProductById(int id) {
        if (!productDatabase.containsKey(id)) {
            throw new ProductNotFoundException("Product with ID " + id + " not found.");
        }
        return productDatabase.get(id);
    }

    // Update Product
    public void updateProduct(int id, Product updatedProduct) {
        if (!productDatabase.containsKey(id)) {
            throw new ProductNotFoundException("Product with ID " + id + " not found.");
        }
        updatedProduct.setId(id);
        productDatabase.put(id, updatedProduct);
    }

    // Delete Product
    public void deleteProduct(int id) {
        if (!productDatabase.containsKey(id)) {
            throw new ProductNotFoundException("Product with ID " + id + " not found.");
        }
        productDatabase.remove(id);
    }
}
