/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Aluno;

/**
 *
 * @author Estudante
 */
public interface AlunoDAO {
    
    public Aluno addOrUpdateAluno(Aluno aluno);
    public Aluno FindByID(Integer id);
    public List<Aluno> FindAll();
    
}
