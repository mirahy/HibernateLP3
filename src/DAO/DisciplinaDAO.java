package DAO;

import java.util.List;
import model.Disciplina;

public interface DisciplinaDAO {
    
    public Disciplina addOrUpdateDisciplina(Disciplina disciplina);
    public Disciplina FindByID(Integer id);
    public List<Disciplina> FindAll();
    
}
