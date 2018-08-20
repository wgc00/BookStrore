package com.entity;

public class Book {

    private int id;
    private String name;
    private float price;
    private String author;
    private String prss;

    public Book(){

    }

    public Book(int id, String name, float price, String author, String prss) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.prss = prss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrss() {
        return prss;
    }

    public void setPrss(String prss) {
        this.prss = prss;
    }
}
