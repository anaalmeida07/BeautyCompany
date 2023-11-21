/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Controller.Helper;

/*
import java.util.ArrayList;
/*import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import view.agendamento;

/**
 *
 * @author crist
 */
/*public class AgendaHelper {
    private final agendamento view;
    private final agendamentoHelper helper;
 

    public AgendaHelper(agendamento view) {
        this.view = view;
        this.helper = new agendamentoHelper(view);
        
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
       /* DefaultTableModel tableModel = (DefaultTableModel) view.get.getModel();
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
             agendamento.getObservacao(),
            });
            
            
            
        }
    }
    
    
}
