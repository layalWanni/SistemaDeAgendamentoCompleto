package DAO;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HistoricoDAO {
    private Connection connection;

    public HistoricoDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaHistorico(){
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.historico ( " +
                "idHistorico BIGSERIAL PRIMARY KEY," +
                "idAgenda BIGINT, " +
                "observacao VARCHAR(50)," +
                "idSecretaria BIGINT," +
                "idPaciente BIGINT," +
                "data DECIMAL(20,20)," +
                "idStatusAgenda BIGINT);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Erro ao criar tabela Historico");
            throw new RuntimeException(e);
        }
    }
}
