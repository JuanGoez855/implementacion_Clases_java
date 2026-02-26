package com.example;

public class Main {
    public static void main(String[] args) {
        //Crear objetos de la clase Product
        Product product1 = new Product();
        Product product2 = new Product();

        //Asignar valores iniciales
        product1.setId("P001");
        product1.setName("Laptop");
        product1.setPrice(999.99);
        product1.setStock(10);

        product2.setId("P002");
        product2.setName("Smartphone");
        product2.setPrice(499.99);
        product2.setStock(25);

        //Utilizar métodos setter
        product1.setPrice(850.00); // Modificamos el precio del producto 1
        product2.setStock(20);     // Modificamos el stock del producto 2

        //Utilizar métodos getter
        System.out.println("Producto 1 - Nombre: " + product1.getName() + " | Precio: $" + product1.getPrice());
        System.out.println("Producto 2 - Nombre: " + product2.getName() + " | Stock: " + product2.getStock());
    }
}