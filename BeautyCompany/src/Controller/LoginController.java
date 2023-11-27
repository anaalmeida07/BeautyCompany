/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author crist
 */

/*uma dica, para quem esta usando a ultima versao do java de 2023 e o netbeans 18, nao usa mais getText na senha, 
pode usar o getPassword que vai da certo e no controller nao colocar String, coloca char[]*/

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    //responsavel pela view de login
    public LoginController(Login view) {
        this.view = view; //acessivel de qualquer lugar da classe
        this.helper = new LoginHelper(view);
    }
    
     
    //nao retorna nada
    public void entrarNoSistema(){
        //Pega um usuario da view
       Usuario usuario = helper.obterModelo();
        //pesquisa o usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        //se o usuario da view tiver o mesmo usuario e senha que o usuario vindo do banco, redireciona pro menu principal
        if(usuarioAutenticado != null){
            //navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
          // senao mostrar uma mensagem ao usuario "Usuario ou Senha invalidos"
        } else{
             view.exibeMensagem("Usuário ou senha inválidos");
             }
        
        
        
    }
    
 
    
}
