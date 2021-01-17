package de.thm.mni;

import de.thm.mni.entity.BusinessUnit;
import org.apache.derby.drda.NetworkServerControl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.InetAddress;

public class SimpleExamplePersist {

    public static void main(String[] args) throws Exception {
        NetworkServerControl server = new NetworkServerControl(InetAddress.getByName("localhost"),1527);
        server.start(null);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eclipseLink");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.persist(new BusinessUnit("Human Resources"));
    }


}
