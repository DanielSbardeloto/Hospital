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
        String sql = "insert into Paciente(nome, idade, CPF, doença, rua, numero, bairro, cidade, UF) values (?,?,?,?,?,?,?,?,?)";
        Integer idCriado = 0;
        try (PreparedStatement stm = cone.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stm.setString(1, paciente.getNome());
            stm.setInt(2, paciente.getIdade());
            stm.setString(3, paciente.getCPF());
            stm.setString(4, paciente.getDoenca());
            stm.setString(5, paciente.getRua());
            stm.setInt(6, paciente.getNumero());
            stm.setString(7, paciente.getBairro());
            stm.setString(8, paciente.getCidade());
            stm.setString(9, paciente.getUF());
            //stm.setDate(10, paciente.getDia());
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
        String sql = "update Paciente set nome = ?, set idade = ?, set CPF = ?, set doença = ?,"
                + " set rua = ?, set numero = ?, set bairro = ?, set cidade = ?, set UF = ? where id = ?";
        
        try (PreparedStatement stm = cone.prepareStatement(sql)) {
            stm.setString(1, paciente.getNome());
            stm.setInt(3, paciente.getIdade());
            stm.setString(4, paciente.getCPF());
            stm.setString(5, paciente.getDoenca());
            stm.setInt(2, paciente.getId());
            stm.setString(1, paciente.getRua());
            stm.setInt(2, paciente.getNumero());
            stm.setString(3, paciente.getBairro());
            stm.setString(4, paciente.getCidade());
            stm.setString(5, paciente.getUF());

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
                    
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    
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
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                   
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
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    
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
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                
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
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    
                    pacientes.add(paciente);
                }
            }
        }

        return pacientes;
    }
    public List<Paciente> findByRua(String rua) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.rua) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + rua.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    
                    pacientes.add(paciente);
                }
            }
        }
     return pacientes;
    }
    
    public List<Paciente> findByNumero(String numero) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.numero) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + numero.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    
                    pacientes.add(paciente);
                }
            }
        }
     return pacientes;
    }
    
    public List<Paciente> findByBairro(String bairro) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.bairro) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + bairro.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    
                    pacientes.add(paciente);
                }
            }
        }
     return pacientes;
    }
    
    public List<Paciente> findByCidade(String cidade) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.cidade) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + cidade.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                  
                    pacientes.add(paciente);
                }
            }
        }
     return pacientes;
    }
    
    public List<Paciente> findByUF(String UF) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.UF) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + UF.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                 
                    pacientes.add(paciente);
                }
            }
        }
     return pacientes;
    }
    
    /*public List<Paciente> findByDia(String dia) throws SQLException {
        String sql = "Select * from Paciente p where upper(p.dia) like ?";
        List<Paciente> pacientes = new ArrayList<>();
        Paciente paciente = null;
        try (PreparedStatement stm = cone.prepareStatement(sql)) {

            stm.setString(1, "%" + dia.toUpperCase() + "%" );
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNome(resultSet.getString("nome"));
                    paciente.setIdade(resultSet.getInt("idade"));
                    paciente.setCPF(resultSet.getString("CPF"));
                    paciente.setDoenca(resultSet.getString("doença"));
                    paciente.setRua(resultSet.getString("rua"));
                    paciente.setNumero(resultSet.getInt("numero"));
                    paciente.setBairro(resultSet.getString("Bairro"));
                    paciente.setCidade(resultSet.getString("Cidade"));
                    paciente.setUF(resultSet.getString("UF"));
                    paciente.setDia(resultSet.getDate("dia"));
                    pacientes.add(paciente);
                }
            }
        }
     return pacientes;
    }*/
}

