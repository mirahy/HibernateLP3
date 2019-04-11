
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
        Aluno c = new Aluno();
        c.setNome("mirahy2");
        
        AlunoDAO dao = new AlunoDAOImpl();
        dao.addOrUpdateAluno(a);
        dao.addOrUpdateAluno(c);
        
        Aluno b = dao.FindByID(1);
        System.out.println("Id:" + b.getRga() + "Nome: " + b.getNome());
      
    }
    
}
