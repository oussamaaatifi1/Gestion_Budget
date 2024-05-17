package com.Beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

    private static final String PERSISTENCE_UNIT_NAME = "default";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

        Transaction transaction = new Transaction();
        transaction.setDescription("fbe");
        transaction.setDate("12-05-2024");
        transaction.setAmount(100);
        transaction.setDescription("jrgbj");
        entityManager.getTransaction().begin();
        entityManager.persist(transaction);

        entityManager.getTransaction().commit();
        System.out.println("Insteretion succesfull");
        entityManager.close();
        factory.close();
    }
}
