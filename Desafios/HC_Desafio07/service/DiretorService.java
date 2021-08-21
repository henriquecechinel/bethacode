package HC_Desafio07.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import HC_Desafio07.model.Diretor;
import HC_Desafio07.util.ConnectionManager;

public class DiretorService implements iService<Diretor>{

    @Override
    public Diretor save(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into curso.diretor values(?,?,?,?,?)");
        insert.setInt(1, diretor.getId());
        insert.setString(2, diretor.getNome());
        insert.setString(3, diretor.getCpf());
        insert.setDouble(4, diretor.getSalario());
        insert.setDouble(5, diretor.getBonus());
        insert.executeUpdate();
        conn.close();

        return diretor;
    }

    @Override
    public Diretor update(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.diretor SET nome = ?, cpf = ?, salario = ?,bonus = ? WHERE id = ?");
        update.setString(1, diretor.getNome());
        update.setString(2, diretor.getCpf());
        update.setDouble(3, diretor.getSalario());
        update.setDouble(4, diretor.getBonus());
        update.setInt(5, diretor.getId());
        update.executeUpdate();
        conn.close();

        return diretor;
    }

    @Override
    public Diretor delete(Diretor diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement delete = conn.prepareStatement("DELETE FROM curso.diretor WHERE ID = ?");
        delete.setInt(1, diretor.getId());
        delete.executeUpdate();
        conn.close();

        return diretor;
    }
}
