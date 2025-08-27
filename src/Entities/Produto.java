package Entities;

import java.io.Serializable;

public class Produto implements Serializable {
    private static final long serialVersionID = 1L;

    private String name;
    private Double price;
    private Integer quantity;

    public Produto(){
    }

    public Produto(String name, double price, Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Produto: [" + name + " | R$" + price + " | " + quantity + "]";
    }
}
