/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.agenda;

import java.util.List;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel S
 */
public class EnderecoTableModel extends AbstractTableModel {

    private List<Paciente> enderecos;

    public EnderecoTableModel(List<Paciente> enderecos) {
        this.enderecos = enderecos;
    }

    public void setEnderecos(List<Paciente> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int getRowCount() {
        return enderecos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente endereco = enderecos.get(rowIndex);
        switch (columnIndex) {
         
            case 0: return endereco.getRua();
            case 1: return endereco.getNumero();
            case 2: return endereco.getBairro();
            case 3: return endereco.getCidade();
            case 4: return endereco.getUF();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
           
            case 0: return "Rua";
            case 1: return "Numero";
            case 2: return "Bairro";
            case 3: return "Cidade";
            case 4: return "UF";
            
            
            default:
                throw new AssertionError();
        }
    }

}