package main;


import org.hibernate.Session;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Cart c = new Cart();
        c.setName("Cart1");
        c.setTotal(25.7);
        c.setCart_id(10);

        Item i1 = new Item();
        i1.setItem_id("Item1");
        i1.setQuantity(10);
        i1.setItem_total(100);

        Item i2 = new Item();
        i2.setItem_id("Item2");
        i2.setQuantity(10);
        i2.setItem_total(100);

        i1.setCart_id(c);
        i2.setCart_id(c);

        Set<Item> items = new HashSet<>();
        items.add(i1);
        items.add(i2);
        c.setItemSet(items);

         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        //start transaction
        session.beginTransaction();
        session.save(c);
        session.save(i1);
        session.save(i2);

        session.getTransaction().commit();
//
//
//
      HibernateUtil.getSessionFactory().close();
//        System.out.println(c.getName());
//








    }
}
