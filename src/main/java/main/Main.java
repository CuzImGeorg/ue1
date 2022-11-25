package main;


import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.postgresql.util.PSQLException;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
        emploee e = new emploee(0, "hello", "rule", new Date());
        Projekt p = new Projekt(100, "p1");
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        session.save(p);

        //Save the Model object

      //  session.save(e);




        //Commit transaction
        session.getTransaction().commit();



        HibernateUtil.getSessionFactory().close();

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        emploee emp = Emploeetest.readEmploee(session);
        Projekt projekt = Emploeetest.readProjekt(session);
        System.out.println(emp.getName());
        System.out.println(projekt.getName());
        HibernateUtil.getSessionFactory().close();
        //terminate session factory, otherwise program won't end





    }
}
