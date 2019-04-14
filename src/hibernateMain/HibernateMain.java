
package hibernateMain;

import DAO.AlunoDAO;
import DAO.AlunoDAOImpl;
import DAO.DisciplinaDAO;
import DAO.DisciplinaDAOImpl;
import conection.ConectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Aluno;
import model.Disciplina;

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
        Disciplina dis1 = new Disciplina();
        dis1.setNome("Matemática");
        Disciplina dis2 = new Disciplina();
        dis2.setNome("Matemática Avançada");
        
        
        AlunoDAO dao = new AlunoDAOImpl();
        dao.addOrUpdateAluno(a);
        dao.addOrUpdateAluno(c);
        
        DisciplinaDAO daoDisc = new DisciplinaDAOImpl();
        daoDisc.addOrUpdateDisciplina(dis1);
        daoDisc.addOrUpdateDisciplina(dis2);
        
        Aluno b = dao.FindByID(1);
        System.out.println("Id:" + b.getRga() + "\nNome: " + b.getNome());
        
        List<Aluno> lista; 
        lista = dao.FindAll();
        
        for(Aluno f : lista){
            System.out.println("\nId:" + f.getRga() + "\nNome: " + f.getNome());
        }
        
        Disciplina disc3 = daoDisc.FindByID(1);
        System.out.println("Id:" + disc3.getId() + "\nNome: " + disc3.getNome());
        
        List<Disciplina> listaDisc; 
        listaDisc = daoDisc.FindAll();
        
        for(Disciplina disc : listaDisc){
            System.out.println("\nId:" + disc.getId() + "\nNome: " + disc.getNome());
        }
        
      
    }
    
}
