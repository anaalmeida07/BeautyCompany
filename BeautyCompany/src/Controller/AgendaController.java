/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.Servico;

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
    
     public void atualizaCliente(){
        //Buscar clientes do banco de dados 
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clientes no combobox cliente
        helper.preencherClientes(clientes);
        
  
    }  
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        helper.preencherServicos(servicos);
        
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
        
    }
    
    public void agendar(){
        //buscar objeto agendamento da tela
       Agendamento agendamento = helper.obterModelo();
        //salvar objeto no banco de dados 
       new AgendamentoDAO().insert(agendamento);
        //inserir elemento na tabela 
       AtualizaTabela();
       helper.limparTela();
        
    }

   
           
   
}
