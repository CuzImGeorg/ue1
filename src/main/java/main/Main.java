package main;


import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Emploee e = new Emploee(0, "hello", "rule", new Date());
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(e);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID="+e.getId());

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionFactory().close();

    }
}
