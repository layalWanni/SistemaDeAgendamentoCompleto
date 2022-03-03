package DAO;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConvenioDAO {
    private Connection connection;

    public ConvenioDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaConvenio() {
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.convenio ( " +
                "idConvenio BIGSERIAL PRIMARY KEY," +
                "nomeConvenio VARCHAR(50)," +
                "valorConvenio DECIMAL(20,20));";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela Convenio");
            throw new RuntimeException(e);
        }
    }
}
