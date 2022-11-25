package main;

import org.hibernate.Session;

public class Emploeetest {




    public Emploeetest() {

    }

    public static emploee  readEmploee(Session ss) {
        return (emploee) ss.load(emploee.class, 1);
    }

    public static Projekt readProjekt(Session ss) {
        return (Projekt) ss.load(Projekt.class, 0);
    }

}
