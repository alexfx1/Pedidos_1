package classes.cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public ArrayList<Cliente> Lista = new ArrayList<Cliente>();
	Scanner scanner = new Scanner(System.in);

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


	/*public ArrayList<Cliente> deletar(int idCliente) {
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
	}*/

	public Cliente buscaID(int idCliente){
		for(Cliente cliente : Lista){
			if(cliente.getId() == idCliente){
				System.out.println("id encontrado\n");
				return cliente;
			} 
		}
		return new Cliente();
	}

	public ArrayList<Cliente> alterarCliente(int idBusca){
		System.out.println("Digite a nova razao social: ");
		String razaosocial = scanner.next();
		System.out.println("Digite a nova fantasia: ");
		String fatasia = scanner.next();

		Cliente cliente = buscaID(idBusca);
		
		cliente.setRazaosocial(razaosocial);
		cliente.setFatasia(fatasia);

		//Cliente clientes = new Cliente();
		//clientes.setRazaosocial(razaosocial);
		return Lista;
	}


	public ArrayList<Cliente> getLista() {
		return this.Lista;
	}

	public void setLista(ArrayList<Cliente> Lista) {
		this.Lista = Lista;
	}



	public ArrayList<Cliente> deletar(int idCliente) {
		System.out.println("Testando ID...");
		for(Cliente cliente : Lista){
			if(cliente.getId() == idCliente){
				Lista.remove(cliente);
				return Lista;
			}
		}
		System.out.println("Cliente com esse id não encontrado!");
		return Lista;
	}

	/*public ArrayList<Cliente> alterar(Cliente client){
		Lista.set(int index, Cliente Element);
		return Lista;
	}*/
	
}