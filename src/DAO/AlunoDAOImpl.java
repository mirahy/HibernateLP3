package DAO;

import conection.ConectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Aluno;

public class AlunoDAOImpl implements AlunoDAO{

    @Override
    public Aluno addOrUpdateAluno(Aluno aluno) {
        EntityManager em = new ConectionFactory().getConection();
        
        try {
            em.getTransaction().begin();
               if(aluno.getRga() == null)
                   em.persist(aluno);
               else
                   em.merge(aluno);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return aluno;
    }

    @Override
    public Aluno FindByID(Integer id) {
        EntityManager em = new ConectionFactory().getConection();    
        Aluno aluno = null;
        try {
            aluno = em.find(Aluno.class, id);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }finally{
            em.close();
        }
        return aluno;
        
    }

    @Override
    public List<Aluno> FindAll() {
        EntityManager em = new ConectionFactory().getConection();  
        List<Aluno> lista = null;
        
        try {
            lista = em.createQuery("from Aluno a").getResultList();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
    
}
