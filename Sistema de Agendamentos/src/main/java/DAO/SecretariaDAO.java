package DAO;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SecretariaDAO {
    private Connection connection;

    public SecretariaDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaSecretaria(){
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.secretaria ( " +
                "idSecretaria BIGSERIAL PRIMARY KEY," +
                "salario DECIMAL(20,20), " +
                "dataContratacao DECIMAL(20,20)," +
                "pis VARCHAR(50));";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Erro ao criar tabela Secretaria");
            throw new RuntimeException(e);
        }
    }
}
