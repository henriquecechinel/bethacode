package HC_Desafio07.repository;

import java.sql.SQLException;
import java.util.List;

public interface iRepository<E> {
    public List<E> findAll() throws SQLException, ClassNotFoundException;
    public E findById(Integer id) throws SQLException, ClassNotFoundException;
}
