
package hibernateMain;

import DAO.AlunoDAO;
import DAO.AlunoDAOImpl;
import conection.ConectionFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Aluno;

public class HibernateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Aluno a = new Aluno();
        a.setNome("mirahy");
        
        AlunoDAO dao = new AlunoDAOImpl();
        dao.addAluno(a);
        
      
    }
    
}
