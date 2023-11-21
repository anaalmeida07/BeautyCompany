/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lmene
 */
public class Servico {
    //criando os atributos da classe serviço
    private int id;
    private String descricao;
    private float valor;

    //criando um construtor para que quando adicione um novo serviço, ele apenas faça isso com esses atributos preenchidos
    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    //criando getter  and setters para os atributos que vão ser alterados futuramente
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override //subscreve o to string
    
    public String toString(){
        return getDescricao();
    }
    
}
