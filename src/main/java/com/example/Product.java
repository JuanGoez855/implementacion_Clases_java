package com.example;

public class Product {
    //Atributos de instancia
    private String id;
    private String name;
    private double price;
    private int stock;

    //metodos getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    //metodos setter
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
    public void setStock(int stock) {
        if (stock >= 0 ) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }
}
