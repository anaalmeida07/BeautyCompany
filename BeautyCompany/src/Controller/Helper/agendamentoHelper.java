/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Agendamento;

import model.Cliente;
import model.Agendamento;
import model.Servico;
import view.agendamento;

/**
 *
 * @author crist
 */
public class agendamentoHelper implements IHelper { //obrigatoriamente deve se criar os metodos abstratos 
    private final agendamento view;

    public agendamentoHelper(agendamento view) {
        this.view = view;
    }   


    public void preencherClientes(ArrayList<Cliente> clientes) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente); // adiciona o objeto cliente no combobox
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }
    
     public Cliente obterCliente(){
     return (Cliente) view.getCliente().getSelectedItem();
        
    }

    public Servico obterServico(){
     return (Servico) view.getServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getValor().setText(valor+""); //se concatenar um valor com string ela transforma tudo em string
        
    }

    @Override
    public Agendamento obterModelo() { //polimorfismo : quando a classe pode ter varias formas
        String idString = view.getId().getText();
        int id = Integer.parseInt(idString); //converte em inteiro
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        
        String valorString = view.getValor().getText();
        float valor = Float.parseFloat(valorString);
        
        String data = view.getData().getText();
        String hora = view.getHora().getText();
        String dataHora = data + " " + hora;
        
        String observacao = view.getObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
       // new Agendamento();
    }


    @Override
    public void limparTela() {
       view.getId().setText(" ");
       view.getHora().setText(" ");
       view.getData().setText(" ");
       view.getObservacao().setText(" ");
    }

}