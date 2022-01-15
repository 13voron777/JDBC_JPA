package LAB4;
import com.itvdn.ex001_jpa_crud.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class AnimalHelper {
    EntityManagerFactory emf;
    EntityManager em;

    public AnimalHelper() {
        emf = Persistence.createEntityManagerFactory("jpa4");
        em = emf.createEntityManager();
    }

    public Animal getById(int id) {
        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        em.getTransaction().commit();
        return animal;
    }

    public void add(Animal animal) {
        em.getTransaction().begin();
        em.merge(animal);
        em.getTransaction().commit();
    }

    public void remove(Animal animal) {
        em.getTransaction().begin();
        em.remove(animal);
        em.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<Animal> getAll() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT animals FROM Animal animals");
        List<Animal> animals = query.getResultList();
        em.getTransaction().commit();
        return animals;
    }
}
