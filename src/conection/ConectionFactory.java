
package conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    
    public EntityManager getConection(){
        return emf.createEntityManager();
    }
    
    public void closeConection(){
        emf.close();
    }
}
