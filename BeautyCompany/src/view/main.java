/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Cliente;
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
        
        Cliente cliente = new Cliente(1, "bea", 'F', "998323455", "Rua sobe e desce numero desaparece");
        System.out.println(cliente);
        
        
        Usuario usuario = new Usuario(1, "Luiz", "Luiz123");
        System.out.println(usuario);
    }
    
    
     
}
