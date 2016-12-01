package br.edu.com.uricer.test;

//import br.edu.com.uricer.dao.DataBase;
//import br.edu.com.uricer.model.Pessoa;
//import br.edu.com.uricer.dao.PessoaDAO;
import Factory.dao.ConnectionFactory;
import Factory.dao.PacienteDAO;
import hospital.agenda.viwer.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class TestaDAO {

    public static void main(String[] args) throws SQLException {
        Paciente paciente = new Paciente();
        paciente.setNome("Barack Obama");

        Integer idCriado;

        try (Connection cone = ConnectionFactory.getConnection()) {
            PacienteDAO pessoaDAO = new PacienteDAO(cone);
            idCriado = pessoaDAO.create(paciente);
            System.out.println("Criada pessoa com id " + idCriado);

            Paciente outraPessoa = pessoaDAO.findById(idCriado);
            System.out.println("Pesquisada pessoa " + outraPessoa);

            List<Paciente> pessoas = pessoaDAO.findByNome("rodrigo");
            System.out.println("Pesquisada por nome");
            for (Paciente p : pessoas) {
                System.out.println(p);
            }
            
    
    
     System.out.println("Testa Update");
     List<Paciente> pessoasParaAtualizar = pessoaDAO.findByNome("obama");
     Paciente pessoaParaAtualizar = pessoasParaAtualizar.get(0);
     System.out.println("Pessoa antes de atualizar " + pessoaParaAtualizar);
     pessoaParaAtualizar.setNome("Michele Obama");
     pessoaDAO.update(pessoaParaAtualizar);
     pessoaParaAtualizar = pessoaDAO.findById(17);
     System.out.println("Pessoa após atualizar " + pessoaParaAtualizar);
            
     System.out.println("Testa Exclusão");
     List<Paciente> pessoasAExcluir = pessoaDAO.findByNome("obama");
     System.out.println("Excluindo pessoa " + pessoasAExcluir.get(0));
     pessoaDAO.delete(pessoasAExcluir.get(0));
}
}
}
