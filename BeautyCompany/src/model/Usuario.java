/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author lmene
 */
public class Usuario extends Pessoa {
    
    //atributos necessários para diferenciar um usuario de cliente
    protected String senha;
    protected String nivelAcesso;

    //construtor = feito para iniciar o objeto, utilizando as caracteristicas definidas
    public Usuario( int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha; //esse construtor diz que para criar um usuario precisa de d, nome e senha
    }

    public Usuario(int id, String nome,char sexo,  String dtNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(id, nome, sexo, dtNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
//getters e setters para pegar e definir informações das variaveis
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    

    

  
    }

   