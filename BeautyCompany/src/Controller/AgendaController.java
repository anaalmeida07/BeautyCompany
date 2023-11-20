/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import view.TabelaAgendamentos;




/**
 *
 * @author crist
 */
public class AgendaController {
    private final TabelaAgendamentos view;
    private final AgendaHelper helper;

    public AgendaController(TabelaAgendamentos view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
   
    
    public void AtualizaTabela(){
        //Buscar uma lista com os agendamentos do banco de dados 
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        // exibir esta lista na view 
        helper.preencherTabela(agendamentos);
    }     
 
    public void navegarParaAgenda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
}
