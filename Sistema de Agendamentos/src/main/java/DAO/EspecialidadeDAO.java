package DAO;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EspecialidadeDAO {
    private Connection connection;

    public EspecialidadeDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaEspecialidade(){
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.especialidade ( " +
                "idAgenda BIGSERIAL PRIMARY KEY," +
                "nomeEspecialidade VARCHAR(50));";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Erro ao criar tabela Especialidade");
            throw new RuntimeException(e);
        }
    }
}
