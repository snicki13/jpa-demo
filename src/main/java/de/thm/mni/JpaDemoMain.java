package de.thm.mni;

import org.apache.derby.drda.NetworkServerControl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.InetAddress;
import java.util.Scanner;

public class JpaDemoMain {

    public static void main(String[] args) throws Exception {
        NetworkServerControl server = new NetworkServerControl(InetAddress.getByName("localhost"),1527);
        server.start(null);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eclipseLink");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(new BusinessUnit());
        new Scanner(System.in).next();
        em.getTransaction().commit();


    }


}
