/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.jpa_rest_demo1.facades;

import dk.webtrade.jpa_rest_demo1.entities.Car;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thomas
 */
public class CarFacace {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Car getCar(Long id) {
        EntityManager em = getEntityManager();
        return em.find(Car.class, id);
    }

    public List<Car> getCars() {
        EntityManager em = getEntityManager();
        return em.createQuery("SELECT c FROM Car c").getResultList();
    }

    public Car addCar(Car c) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("CAR was not created");
        }
        return c;
    }
    public static void main(String[] args) {
//        new CarFacace().addCar(new Car("VW", "Move Up", 2015));
//        new CarFacace().addCar(new Car("Peugeot", "Rifter", 2018));
        System.out.println(new CarFacace().getCars());
    }
}
