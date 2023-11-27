/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import model.Agendamento;
import view.MenuPrincipal;
import view.agendamento;

/**
 *
 * @author crist
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;
    
    public MenuPrincipalController(MenuPrincipal view){
        this.view = view;
    }
    
      public void navegarParaAgenda() throws SQLException{
        agendamento agenda = new agendamento();
        agenda.setVisible(true);
        this.view.dispose();
    }
}
