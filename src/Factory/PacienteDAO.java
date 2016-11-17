package Factory;

import hospital.agenda.Paciente;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */
public class PacienteDAO {
    
    private Connection cone;

    public PacienteDAO(Connection cone) {
        this.cone = cone;
    }
    
    public Integer create(Paciente paciente) throws SQLException {
        String sql = "insert into Paciente(nome, idade, CPF, doença) values (?,?,?,?)";
        Integer idCriado = 0;
        try (PreparedStatement stm = cone.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stm.setString(1, paciente.getNome());
            stm.setInt(2, paciente.getIdade());
            stm.setString(3, paciente.getCPF());
            stm.setString(4, paciente.getDoenca());
            stm.execute();
            
            try (ResultSet resultSet = stm.getGeneratedKeys()) {
                while (resultSet.next()) {
                    idCriado = resultSet.getInt(1);
                }
            }            
            cone.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar executar insercao: " + ex.getMessage());
            cone.rollback();
        }
        
        return idCriado;
    }
    public void update(Paciente paciente) throws SQLException {
        String sql = "update Paciente set nome = ?, set idade = ?, set CPF = ?, set doença = ? where id = ?";
        
        try (PreparedStatement stm = cone.prepareStatement(sql)) {
            stm.setString(1, paciente.getNome());
            stm.setInt(3, paciente.getIdade());
            stm.setString(4, paciente.getCPF());
            stm.setString(5, paciente.getDoenca());
            stm.setInt(2, paciente.getId());
            stm.executeUpdate();
            
            cone.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar executar atualização: " + ex.getMessage());
            cone.rollback();
        }
    }
    
    public void delete(Paciente paciente) throws SQLException {
        String sql = "delete from Paciente where id = ?";
        
        try (PreparedStatement stm = cone.prepareStatement(sql)) {
            stm.setInt(1, paciente.getId());
            stm.executeUpdate();
            
            cone.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar excluir: " + ex.getMessage());
            cone.rollback();
        }
    } 
    
    public Paciente findById(Integer id) throws SQLException {
        String sql = "Select * from Paciente p where p.id = ?";
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {
            stm.setInt(1, id);
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doenca"));
                }
            }
        }

        return paciente;
    }

    public List<Paciente> findByNome(String nome) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.nome) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + nome.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    pacientes.add(paciente);
                }
            }
        }

        return pacientes;
    }
    public List<Paciente> findByIdade(Integer idade) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.idade) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + idade.toString() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    pacientes.add(paciente);
                }
            }
        }

        return pacientes;
    }
    public List<Paciente> findByDoenca(String doenca) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.doença) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + doenca.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    pacientes.add(paciente);
                }
            }
        }

        return pacientes;
    }
    
    public List<Paciente> findByCPF(String CPF) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.CPF) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + CPF.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    pacientes.add(paciente);
                }
            }
        }

        return pacientes;
    }
}
