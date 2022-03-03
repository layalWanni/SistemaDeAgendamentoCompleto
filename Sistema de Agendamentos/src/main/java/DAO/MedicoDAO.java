package DAO;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicoDAO {
    private Connection connection;

    public MedicoDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaHistorico(){
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.medico ( " +
                "idMedico BIGSERIAL PRIMARY KEY," +
                "crm VARCHAR(50), " +
                "porcenParticipacao DECIMAL(20,20)," +
                "consultorio VARCHAR(50)," +
                "idEspecialidade BIGINT);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Erro ao criar tabela Medico");
            throw new RuntimeException(e);
        }
    }
}
