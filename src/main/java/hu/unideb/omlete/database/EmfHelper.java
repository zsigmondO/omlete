package hu.unideb.omlete.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfHelper {

    private static final String PERSISTENCE_UNIT_NAME = "MyPU";
    private static EntityManagerFactory mf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager getEntityManager() {
        return mf.createEntityManager();
    }
}
