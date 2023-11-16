/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import view.TabelaAgendamentos;

/**
 *
 * @author Fatec
 */
public class TabelaHelper {
    private final TabelaAgendamentos view;

    public TabelaHelper(TabelaAgendamentos view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
      //atraves da variavel tableModel temos acesso ao conteudo daquela tabela 
         DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
         tableModel.setNumRows(0);
         
         //Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
          agendamento.getId(),
          agendamento.getCliente().getNome(),
          agendamento.getServico().getDescricao(),
          agendamento.getValor(),
          agendamento.getDataFormatada(),
          agendamento.getHoraFormatada(),
          agendamento.getObservacao()
            });
            
            
            
        }
    }  
    
    
    
}
