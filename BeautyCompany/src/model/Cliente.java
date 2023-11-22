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
public class Cliente extends Pessoa {
  
  //classe cliente tem somente endereco e cep, pois esta recebendo os outros
  //dados da classe pessoa
    private String endereco;
    private String cep;

    //atraves deste construtor ele chama o super construtor da classe Pessoa(pai)
    public Cliente( int id, String nome, char sexo, String dtNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, dtNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    //gerar um cliente com apenas id, nome, cep e endereco
    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //subscreve o to string
    @Override 
    public String toString(){
        return getNome();
    }


    
    
    
    
}
