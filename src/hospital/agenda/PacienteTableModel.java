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
public class PacienteTableModel extends AbstractTableModel {

    private List<Paciente> pacientes;

    public PacienteTableModel(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int getRowCount() {
        return pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente paciente = pacientes.get(rowIndex);
        switch (columnIndex) {
            case 0: return paciente.getId();
            case 1: return paciente.getNome();
            case 2: return paciente.getIdade();
            case 3: return paciente.getDoenca();
            case 4: return paciente.getCPF();
            case 5: return paciente.getSexo();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id";
            case 1: return "Nome";
            case 2: return "Idade";
            case 3: return "Diagnóstico";
            case 4: return "CPF";
            case 5: return "Sexo";
            
            default:
                throw new AssertionError();
        }
    }

}
