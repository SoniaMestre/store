package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.factoriaf5.store.models.Person;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    public List<Product> products = new ArrayList<>();
    private Object name;

    @GetMapping("/products")
    public List<Product> allProducts() {
        return products;
    }

    @PostMapping("/products")
    public void addProduct(Product product) {
        products.add(product);
    }
    @DeleteMapping(/DELETE/products{name})
    public Product findProduct(String name, List<Product> products) {

        Product[] product;
        for (Product product : product) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;

        products.remove(product)
    }
}



