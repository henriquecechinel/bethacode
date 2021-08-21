package HC_Desafio07.repository;

import HC_Desafio07.model.Diretor;
import HC_Desafio07.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiretorRepository implements iRepository<Diretor>{

    @Override
    public List<Diretor> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM curso.diretor");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Diretor> diretores = new ArrayList<>();

        System.out.println("---- Inicio FindAll ----");
        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);
        }
        System.out.println("---- Fim FindAll ----");
        conn.close();

        return diretores;
    }

    @Override
    public Diretor findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement findById = conn.prepareStatement("SELECT * FROM curso.diretor WHERE id = ?");
        findById.setInt(1, id);
        ResultSet resultFindById = null;
        resultFindById = findById.executeQuery();

        System.out.println("---- Inicio FindById ----");
        while (resultFindById.next()) {
            String index = resultFindById.getString(2);
            System.out.println(index);
        }
        System.out.println("---- Fim FindById ----");
        conn.close();

        return new Diretor();
    }
}
