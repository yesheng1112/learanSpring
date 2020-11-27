package com.ys.factoryMethod;

public class Factory {

    private Product createProduct() {
        return new Product();
    }

    public Product createProduct(String name, Integer price){
        return new Product(name,price);
    }

    public Product createProduct(Integer price){
        return new Product(price);
    }

    public Product createProduct(String name){
        return new Product(name);
    }

    public Product createProduct(String name, Integer price, String age) {
        return new Product(name, price);
    }
}
