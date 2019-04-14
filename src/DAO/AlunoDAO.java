package DAO;

import java.util.List;
import model.Aluno;

public interface AlunoDAO {
    
    public Aluno addOrUpdateAluno(Aluno aluno);
    public Aluno FindByID(Integer id);
    public List<Aluno> FindAll();
    
}
