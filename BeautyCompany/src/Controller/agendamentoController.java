/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.agendamentoHelper;
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

public class agendamentoController {
    private final agendamento view;
    private final agendamentoHelper helper1;
    private final AgendaController helper2;


    public agendamentoController(agendamento view) {
        this.view = view;
        this.helper1 = new agendamentoHelper(view);
        this.helper2 = new AgendaController(view);
        
    }

    public void atualizaCliente(){
        //Buscar clientes do banco de dados 
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clientes no combobox cliente
        helper1.preencherClientes(clientes);
        
  
    }  
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        helper1.preencherServicos(servicos);
        
    }
    
    public void atualizaValor(){
        Servico servico = helper1.obterServico();
        helper1.setarValor(servico.getValor());
        
    }
    
    public void agendar(){
        //buscar objeto agendamento da tela
        Agendamento agendamento = helper1.obterModelo();
        //salvar objeto no banco de dados 
        new AgendamentoDAO().insert(agendamento);
        //inserir elemento na tabela 
        helper2.AtualizaTabela();
        helper1.limparTela();
        
    }
            
}
