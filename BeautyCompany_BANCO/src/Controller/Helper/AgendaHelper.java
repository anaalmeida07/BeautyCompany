
package Controller.Helper;
//import Controller.Helper.agendamentoHelper;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.agendamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author crist
 */
public class AgendaHelper implements IHelper{
    private final agendamento view;
    
 

    public AgendaHelper(agendamento view) {
        this.view = view;
        
        
    }

   public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelaAgendamento().getModel();
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
    
   
    public void preencherClientes(ArrayList<Cliente> clientes) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente); // adiciona o objeto cliente no combobox
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
      //pega o modelo e converte em um  modelo padrão
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }
    /*obter um cliente, retornando uma instancia cliente 
    pegando o item selecionado do jcombobox cliente, transforma
   em um objeto cliente*/
        
     public Cliente obterCliente(){
     return (Cliente) view.getCliente().getSelectedItem(); 
    }

    public Servico obterServico(){
     return (Servico) view.getServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getValor().setText(valor+" "); //se concatenar um valor com string ela transforma tudo em string
        
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
        
        //O objeto agendamento contempla tudo o que o usuario colocar 
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
       // new Agendamento();
    }

@Override // subscreve 
    public void limparTela() {
       view.getId().setText("0");
       view.getHora().setText("");
       view.getData().setText("");
       view.getObservacao().setText("");
    }

    
}
