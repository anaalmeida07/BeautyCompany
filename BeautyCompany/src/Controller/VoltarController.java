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
public class VoltarController {
    private final TabelaAgendamentos view;

    public VoltarController(TabelaAgendamentos view) {
        this.view = view;
    }
    public void voltarParaAgenda(){
        agendamento voltar  = new agendamento();
        voltar.setVisible(true);

}
    
}
