package HC_Desafio07.service;

import java.sql.SQLException;

public interface iService<E> {
    public E save(E objeto) throws SQLException, ClassNotFoundException;

    public E update(E objeto) throws SQLException, ClassNotFoundException;

    public E delete(E objeto) throws SQLException, ClassNotFoundException;

}
