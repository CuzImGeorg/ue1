package main;

import java.util.Set;

public class Cart {

    private int cart_id;
    private double total;
    private String name;
    private Set<Item> itemSet;

    public Cart() {
    }



    public Cart(int carr_id, double total, String name, Set<Item> itemSet) {
        this.cart_id = carr_id;
        this.total = total;
        this.name = name;
        this.itemSet = itemSet;
    }

    public Cart( double total, String name, Set<Item> itemSet) {
        this.total = total;
        this.name = name;
        this.itemSet = itemSet;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }
}
