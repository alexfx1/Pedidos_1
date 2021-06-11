package Classes.Cliente;
import java.util.ArrayList;

public class Lista {
    public ArrayList<Cliente> Lista = new ArrayList<Cliente>();

    public ArrayList<Cliente> inserir(Cliente client) {
	
		Lista.add(client);
		return Lista;
	}


	public ArrayList<Cliente> deletar(int idCliente) {
		System.out.println("Testando ID...");
		for(Cliente cliente : Lista){
			if(cliente.getId() == idCliente){
				Lista.remove(cliente);
			}
		}
		System.out.println("Cliente deletado com Sucesso!");
		return Lista;
	}

	/*public ArrayList<Cliente> alterar(Cliente client){
		Lista.set(int index, Cliente Element);
		return Lista;
	}*/
	
}
