/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author nguye
 */
public class Product {
    private int id;
    private int category_id;
    private int price;
    private String name;
    private String image;
    private String description;

    public Product() {
    }

    public Product(int id, int category_id, int price, String name, String image, String description) {
        this.id = id;
        this.category_id = category_id;
        this.price = price;
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public Product(int category_id, int price, String name, String image, String description) {
        this.category_id = category_id;
        this.price = price;
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
