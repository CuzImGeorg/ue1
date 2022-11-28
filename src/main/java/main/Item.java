package main;

public class Item {
    private int id, cart_id, quantity;
    private double item_total;
    private String item_id;


    public int getId() {
        return id;
    }


    public Item(int id, int cart_id, int quantity, double item_total, String item_id) {
        this.id = id;
        this.cart_id = cart_id;
        this.quantity = quantity;
        this.item_total = item_total;
        this.item_id = item_id;
    }

    public  Item() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItem_total() {
        return item_total;
    }

    public void setItem_total(double item_total) {
        this.item_total = item_total;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
}
