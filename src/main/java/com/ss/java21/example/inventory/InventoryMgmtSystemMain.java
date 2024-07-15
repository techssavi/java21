package com.ss.java21.example.inventory;

public class InventoryMgmtSystemMain {

    public static void main(String[] args){

            InventoryManager manager = new InventoryManager();
            Thread virtualThread =  Thread.ofVirtual().start(() -> {
                // Simulate user interactions
                manager.addProduct(new Product("Laptop", 10));
                manager.addProduct(new Product("Apple", 50));
                System.out.println(manager.listProducts());

                System.out.println(manager.categorizeProduct(new Product("Laptop", 10)));
                System.out.println(manager.categorizeProduct(new Product("Apple", 50)));
            });
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
