package com.ss.java21.example.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(product -> product.name().equals(name));
    }

    public List<Product> listProducts() {
        return List.copyOf(products);
    }

    public String categorizeProduct(Product product) {
        return switch (product.name()) {
            case "Laptop" -> "Electronics";
            case "Apple" -> "Groceries";
            default -> "Unknown";
        };
    }
}