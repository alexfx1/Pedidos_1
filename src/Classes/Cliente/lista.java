package classes.cliente;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Lista {
    public ArrayList<Cliente> Lista = new ArrayList<Cliente>();
	Scanner scanner = new Scanner(System.in);

    public ArrayList<Cliente> inserir(Cliente client) {
		int contador = client.contador;
		Lista.add(client);
		contador = contador + 1;
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

	public Cliente buscaID(int idCliente){
		for(Cliente cliente : Lista){
			if(cliente.getId() == idCliente){
				System.out.println("id encontrado\n");
				return cliente;
			} 
		}
		return new Cliente();
	}

	public int contadorID(int cont){
		cont = Lista.stream().mapToInt(Cliente::getId).max().orElse(0);
		return new AtomicInteger(cont).get();
	}

	public ArrayList<Cliente> alterarCliente(int idBusca){
		System.out.println("Digite a nova razao social: ");
		String razaosocial = scanner.next();
		System.out.println("Digite a nova fantasia: ");
		String fatasia = scanner.next();

		Cliente cliente = buscaID(idBusca);
		
		cliente.setRazaosocial(razaosocial);
		cliente.setFatasia(fatasia);

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
}