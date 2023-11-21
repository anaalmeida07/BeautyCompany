/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Controller.Helper.agendamentoHelper;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;

import Controller.agendamentoController;
import view.agendamento;




/**
 *
 * @author crist
 */
public class AgendaController {
    private final agendamento view;
    private final AgendaHelper helper;
    

    public AgendaController(agendamento view) {
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

    
        
    public void agendar(){
        //buscar objeto agendamento da tela
       // Agendamento agendamento = helper.obterModelo();
        //salvar objeto no banco de dados 
       // new AgendamentoDAO().insert(agendamento);
        //inserir elemento na tabela 
       // helper.AtualizaTabela();
       // helper.limparTela();
        
    }
           
    
}
