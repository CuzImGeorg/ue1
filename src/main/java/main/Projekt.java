package main;

public class Projekt {

    private int id, dauer;
    private String name;



    public Projekt() {

    }

    public Projekt(int dauer, String name) {

        this.dauer = dauer;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
