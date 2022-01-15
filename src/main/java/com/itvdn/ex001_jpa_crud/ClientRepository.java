package com.itvdn.ex001_jpa_crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Asus on 30.10.2017.
 */
public class ClientRepository {

    EntityManagerFactory emf;
    EntityManager em;

    public ClientRepository() {
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    public Client getById(int id) {
        em.getTransaction().begin();
        Client client = em.find(Client.class, id);
        em.getTransaction().commit();
        return client;
    }

    public void add(Client c) {
        em.getTransaction().begin();
        em.merge(c); // äîáàâëÿåì êëèåíòà
        em.getTransaction().commit();
    }

    public void remove(Client c) {
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<Client> getAll() {
        em.getTransaction().begin();
        // JPQL (Java Persistent Query Language)
        Query query = em.createQuery("SELECT ñlients FROM Client ñlients");
        List<Client> clients = query.getResultList();
        em.getTransaction().commit();
        return clients;
    }

}
