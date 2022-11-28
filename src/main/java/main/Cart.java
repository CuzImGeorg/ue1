package main;

public class Cart {

    private int carr_id;
    private double total;
    private String name;


    public Cart() {
    }

    public Cart(int carr_id, double total, String name) {
        this.carr_id = carr_id;
        this.total = total;
        this.name = name;
    }

    public int getCarr_id() {
        return carr_id;
    }

    public void setCarr_id(int carr_id) {
        this.carr_id = carr_id;
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
}
