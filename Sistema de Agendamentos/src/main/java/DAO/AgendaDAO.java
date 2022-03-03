package DAO;
//timestamp
import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendaDAO {

    private Connection connection;

    public AgendaDAO() throws SQLException{
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaAgenda(){
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.agenda ( " +
                "idAgenda BIGSERIAL PRIMARY KEY," +
                "idPaciente BIGINT, " +
                "idMedico BIGINT," +
                "idStatusAgenda BIGINT," +
                "encaixe BOOLEAN);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Erro ao criar tabela Agenda");
            throw new RuntimeException(e);
        }
    }

}
