/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Agendamento;
import model.Cliente;
import model.Pessoa;
import model.Servico;
import model.Usuario;

/**
 *
 * @author lmene
 */
public class main {
    public static void main(String[] args) {
        String nome= "Ana";
        System.out.println(nome);
        
       //tipo da variavel: servico
       Servico corte = new Servico(1, "Corte", 50); //instanciando a variavel
        System.out.println(corte.getDescricao());
        System.out.println(corte.getValor());
        
        Cliente cliente = new Cliente(2, "Ana", "Rua sobe e desce numero desaparece", "11404521");
        System.out.println(cliente.getNome());
        
        
        Usuario usuario = new Usuario(1, "manicure", "Luiz123");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, corte, 30, "27/11/2023 09:15");
        System.out.println(agendamento.getCliente().getNome());
                
                
                
                
    }
    
    
     
}
