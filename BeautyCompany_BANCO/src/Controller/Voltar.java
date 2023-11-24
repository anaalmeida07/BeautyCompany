/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.MenuPrincipal;

/**
 *
 * @author crist
 */
public class Voltar {
    private final MenuPrincipal view;


    public Voltar(MenuPrincipal view) {
        this.view = view;
    }

    public void navegarParaMenu(){
        MenuPrincipal voltar = new MenuPrincipal();
         voltar.setVisible(true);
    }
}
