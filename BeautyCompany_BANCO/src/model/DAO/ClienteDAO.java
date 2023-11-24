package Model.DAO;

import java.util.ArrayList;
import model.Cliente;



public class ClienteDAO {
     public static ArrayList<Cliente> clientes = new ArrayList<>();
    /**
     * Insere um cliente dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Cliente cliente){
        Banco.cliente.add(cliente);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cliente
     * @return 
     */
    public boolean update(Cliente cliente){
        
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if(idSaoIguais(Banco.cliente.get(i), cliente)){
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;      
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Cliente cliente){
        for (Cliente clienteLista : Banco.cliente) {
            if(idSaoIguais(clienteLista, cliente)){
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um ArrayList com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Cliente> selectAll(){
        return Banco.cliente;
    }
    
    /**
     * Compara se dois objetos têm a propriedade id igual
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os ids forem iguais e falso se não forem
     */
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getId() ==  clienteAComparar.getId();
    }
}
