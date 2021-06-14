package classes.cliente;
import java.util.ArrayList;

public class Lista {
    public ArrayList<Cliente> Lista = new ArrayList<Cliente>();

    public ArrayList<Cliente> inserir(Cliente client) {
		Lista.add(client);
		return Lista;
	}

	public ArrayList<Cliente> verificaID(int idCliente) throws Exception{
		for(Cliente client : Lista){
			if(client.getId() == idCliente){
				throw new Error("ID ja existente digite outro novamente!!");
			} 
		}
		return Lista;
	}


	public ArrayList<Cliente> deletar(int idCliente) {
		System.out.println("Testando ID...");
		for(Cliente cliente : Lista){
			if(cliente.getId() != idCliente){
				System.out.println("Digite outro id - id n encontrado");
				return Lista;
			}
			else {
				Lista.remove(cliente);
				System.out.println("Cliente deletado com Sucesso!");
				return Lista;
			}
		}
		return Lista;
	}

	/*public ArrayList<Cliente> deletar(int idCliente) {
		System.out.println("Testando ID...");
		for(Cliente cliente : Lista){
			if(cliente.getId() == idCliente){
				Lista.remove(cliente);
				return Lista;
			}
		}
		System.out.println("Cliente deletado com Sucesso!");
		return Lista;
	}*/

	/*public ArrayList<Cliente> alterar(Cliente client){
		Lista.set(int index, Cliente Element);
		return Lista;
	}*/
	
}