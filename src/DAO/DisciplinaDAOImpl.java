/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conection.ConectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Disciplina;

/**
 *
 * @author myrah
 */
public class DisciplinaDAOImpl implements DisciplinaDAO{

    @Override
    public Disciplina addOrUpdateDisciplina(Disciplina disciplina) {
        EntityManager em = new ConectionFactory().getConection();
        
        try {
            em.getTransaction().begin();
               if(disciplina.getId() == null)
                   em.persist(disciplina);
               else
                   em.merge(disciplina);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return disciplina;
    }

    @Override
    public Disciplina FindByID(Integer id) {
        EntityManager em = new ConectionFactory().getConection();    
        Disciplina disciplina = null;
        try {
            disciplina = em.find(Disciplina.class, id);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }finally{
            em.close();
        }
        return disciplina;
    }

    @Override
    public List<Disciplina> FindAll() {
        EntityManager em = new ConectionFactory().getConection();  
        List<Disciplina> lista = null;
        
        try {
            lista = em.createQuery("from Disciplina d").getResultList();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        return lista;
    }
    
}
