package Classes.Cliente;
import java.util.ArrayList;

public class lista {
    public ArrayList<Cliente> lista = new ArrayList<>();

    public ArrayList<Cliente> inserir(Cliente client) {
		lista.add(client);
		return lista;
	}
}
