package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("book");
        EntityManager em=factory.createEntityManager();


        Query query=em.createQuery("from Book");
        List<Book> bookList=query.getResultList();

        for (Book b:bookList) {
            System.out.println(b.getBook()+" "+b.getBookName());
        }

        em.close();
        factory.close();

    }
}
