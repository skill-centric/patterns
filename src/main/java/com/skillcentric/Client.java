package com.skillcentric;

public class Client {

    public static void main(String[] args) {

        ItemRegistry registry = new ItemRegistry();

        Book myBook = (Book) registry.getBasicItem("Book");

        myBook.setTitle("Custom Title");

        System.out.println(myBook.getTitle());
        System.out.println(myBook.getPrice());
    }
}