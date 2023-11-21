/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.TabelaAgendamentos;
import view.agendamento;

/**
 *
 * @author crist
 */
public class TabelaController {
    private final agendamento view;

    
    public TabelaController(agendamento view) {
        this.view = view;
    }

    public void navegarParaAgenda() {
        TabelaAgendamentos agenda = new TabelaAgendamentos();
        agenda.setVisible(true);
    }

  
    
}
