/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "bea", 'F', "09/05/1996", "30212121", "beathings@gmail.com", "521454123", "bea123", "administrador");
        Usuario usuario2 = new Usuario(2, "luiz", 'M', "09/05/1996", "30212122", "lmenezes@gmail.com", "451244123", "luiz123", "administrador");
        Usuario usuario3 = new Usuario(3, "ana", 'F', "07/08/2004", "997209031", "anaalmeida0704@gmail.com", "000000", "ana123", "administrador");
        Usuario usuario4 = new Usuario(4, "Jubscleuda", 'F', "09/05/1993", "999876531", "jubscleuda@gmail.com", "000000", "recep123", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Alana Figueiredo", 'M', "30/01/1995", "30212126", "alan.fig@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Paula Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Gabriela Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Marta Pipoqueira", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "Fernanda Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(7, "Carla da Silva", 'F', "25/03/1993", "302121292", "puposilva@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Cliente cliente9 = new Cliente(9, "Manuela Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Carol Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Servico servico1 = new Servico(1, "Corte Simples", 50);
        Servico servico2 = new Servico(2, "Corte em V", 55);
        Servico servico3 = new Servico(3, "Corte camadas", 65);
        Servico servico4 = new Servico(4, "Coloração", 250);
        Servico servico5 = new Servico(5, "Tratamento Capilar", 300);
        Servico servico6 = new Servico(6, "Sombrancelhas simples", 45);
        Servico servico7 = new Servico(7, "Penteados", 150);
        Servico servico8 = new Servico(8, "Sombrancelhas henna", 50);
        Servico servico9 = new Servico(9, "Escova e chapinha", 100);
        Servico servico10 = new Servico(10, "Progressiva", 100);
        Servico servico11 = new Servico(11, "Manicure", 45);
        Servico servico12 = new Servico(12, "Pedicure", 35);
        Servico servico13 = new Servico(13, "Maquiagem", 170);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 55, "22/12/2023 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 250, "14/12/2023 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 50, "16/12/2023 14:30");
        Agendamento agendamento4 = new Agendamento(4, cliente10, servico5, 300, "05/12/2023 16:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        usuario.add(usuario4);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        servico.add(servico7);
        servico.add(servico8);
        servico.add(servico9);
        servico.add(servico10);
        servico.add(servico11);
        servico.add(servico12);
        servico.add(servico13);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        agendamento.add(agendamento4);
        
    }
    
    
}
