/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.TabelaHelper;
import Model.DAO.AgendamentoDAO;
import java.util.ArrayList;
import model.Agendamento;
import view.TabelaAgendamentos;

/**
 *
 * @author Fatec
 */
public class TabelaController {
    private final TabelaAgendamentos view;
    private final TabelaHelper helper;

    public TabelaController(TabelaAgendamentos view) {
        this.view = view;
        this.helper = new TabelaHelper(view);
    }
    
    
    public void atualizaTabela(){
    //Buscar uma lista com agendamentos no Banco de dado
    //tabelaAgenda = agendamentoDAO
    AgendamentoDAO tabelaAgenda = new AgendamentoDAO();
     ArrayList<Agendamento> agendamentos = tabelaAgenda.selectAll();
     //Exibir a lista na view
     helper.preencherTabela(agendamentos);
       
    }
}

