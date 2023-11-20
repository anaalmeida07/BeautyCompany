/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.agendamentoHelper;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import view.agendamento;




/**
 *
 * @author crist
 */

public class agendamentoController {
    private final agendamento view;
    private final agendamentoHelper helper1;

    public agendamentoController(agendamento view) {
        this.view = view;
        this.helper1 = new agendamentoHelper(view);
    }

    public void atualizaCliente(){
        //Buscar clientes do banco de dados 
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clientes no combobox cliente
        helper1.preencherClientes(clientes);
        
  
    }   
}
