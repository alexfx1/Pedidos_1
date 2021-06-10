package Classes.Cliente;
import java.util.ArrayList;

import javax.lang.model.element.Element;

public class Lista {
    public ArrayList<Cliente> Lista = new ArrayList<Cliente>();

    public ArrayList<Cliente> inserir(Cliente client) {
		Lista.add(client);
		return Lista;
	}

	public ArrayList<Cliente> deletar(Cliente client){
		Lista.remove(client);
		return Lista;
	}

	/*public ArrayList<Cliente> alterar(Cliente client){
		Lista.set(int index, Cliente Element);
		return Lista;
	}*/
	
}
