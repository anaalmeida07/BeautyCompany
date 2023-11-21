/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import model.Usuario;
import view.Login;

/**
 *
 * @author crist
 */
public class LoginHelper implements IHelper { //
    //os helpers o que pega os dados da tela e transforma em um modelo ou um modelo em dados na tela
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Usuario modelo = new Usuario(0, nome, senha);
    return modelo;
    }
    
    public void setarModelo(Usuario modelo)
    {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
}
