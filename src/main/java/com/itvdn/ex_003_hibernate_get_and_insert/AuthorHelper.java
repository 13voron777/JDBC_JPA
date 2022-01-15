package com.itvdn.ex_003_hibernate_get_and_insert;

import com.itvdn.ex_003_hibernate_get_and_insert.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by Asus on 01.11.2017.
 */
public class AuthorHelper {

    private final SessionFactory sessionFactory;

    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList(){
        // открыть сессию - для манипуляции с персист. объектами
        Session session = sessionFactory.openSession();

        CriteriaQuery<Author> criteriaQuery = session.getCriteriaBuilder().createQuery(Author.class);
        criteriaQuery.from(Author.class);

        List<Author> authorList = session.createQuery(criteriaQuery).getResultList();

        session.close();

        return authorList;
    }

    public Author getAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, id); // получение объекта по id
        session.close();
        return author;
    }

    public Author addAuthor(Author author){

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

        session.close();

        return author;
    }
}
