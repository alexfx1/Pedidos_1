package exe;

import java.util.ArrayList;

import classes.cliente.Cliente;
import classes.cliente.Endereco;
import classes.cliente.Estado;
import classes.cliente.Lista;

public class AppTeste {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Lista listaCliente = new Lista();

        Estado estado = new Estado();
        estado.setIdEstado(1);
        estado.setNomeEstado("Minas Gerais");
        estado.setUf("MG");

        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setLogradouro("logradouro");
        endereco.setNumero(1300);
        endereco.setQuadra("Quadra1");
        endereco.setLote(6);
        endereco.setEstado(estado);
        endereco.setBairro("Lagoinha");

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setRazaosocial("Alexandre");
        cliente1.setFatasia("Savastano");
        cliente1.setEndereco(endereco);

        clientes = listaCliente.inserir(cliente1);

        Estado estado1 = new Estado();
        estado1.setIdEstado(1);
        estado1.setNomeEstado("Minas Gerais");
        estado1.setUf("MG");

        Endereco endereco1 = new Endereco();
        endereco1.setId(1);
        endereco1.setLogradouro("logradouro");
        endereco1.setNumero(1300);
        endereco1.setQuadra("Quadra1");
        endereco1.setLote(6);
        endereco1.setEstado(estado);
        endereco1.setBairro("Lagoinha");

        Cliente cliente2 = new Cliente();
        cliente2.setId(1);
        cliente2.setRazaosocial("Juliana");
        cliente2.setFatasia("Abril");
        cliente2.setEndereco(endereco);

        clientes = listaCliente.inserir(cliente2);
    }
}
