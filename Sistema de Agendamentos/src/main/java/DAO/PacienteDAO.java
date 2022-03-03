package DAO;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PacienteDAO {
    private Connection connection;

    public PacienteDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaHistorico(){
        String sql = "CREATE TABLE IF NOT EXISTS consultorio.paciente ( " +
                "idPaciente BIGSERIAL PRIMARY KEY," +
                "idTipoAtendimento BIGINT, " +
                "idConvenio BIGINT," +
                "numeroCartaoConvenio VARCHAR(50)," +
                "dataVencimento TIMESTAMP);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e){
            System.out.println("Erro ao criar tabela Paciente");
            throw new RuntimeException(e);
        }
    }
}
