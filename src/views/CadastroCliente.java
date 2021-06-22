package views;
import classes.Endereco;
import classes.Estado;
import classes.cliente.Cliente;
import classes.cliente.Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    Lista listacliente = new Lista();
    
    public void cadastroC(Scanner scanner){
        System.out.println(" \n ---------- Cliente ---------- ");
        System.out.println(" \nDigite o id: ");
        int id = scanner.nextInt();
        System.out.println(" \nDigite a razaosocial: ");
        String razaosocial = scanner.next();
        System.out.println(" \nDigite a fantasia: ");
        String fatasia = scanner.next();
        //endereco
        
        System.out.println(" \n ---------- Endereco ----------");
        System.out.println(" \nDigite a idEndereco: ");
        int idEndereco = scanner.nextInt();
        System.out.println(" \nDigite o logradouro: ");
        String logradouro = scanner.next();
        System.out.println(" \nDigite o numero: ");
        int numero = scanner.nextInt();
        System.out.println(" \nDigite a quadra: ");
        String quadra = scanner.next();
        System.out.println(" \nDigite o lote(numero): ");
        float lote = scanner.nextFloat();
        //estado
        System.out.println(" \nDigite o bairro: ");
        String bairro = scanner.next();

        System.out.println(" \n ---------- Estado ----------");
        System.out.println(" \nDigite o idEstado: ");
        int idEstado = scanner.nextInt();
        System.out.println(" \nDigite o nome do estado: ");
        String nomeEstado = scanner.next();
        System.out.println(" \nDigite a uf: ");
        String uf = scanner.next();




        Estado estado = new Estado();
        estado.setIdEstado(idEstado);
        estado.setNomeEstado(nomeEstado);
        estado.setUf(uf);

        Endereco endereco = new Endereco();
        endereco.setId(idEndereco);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setQuadra(quadra);
        endereco.setLote(lote);
        endereco.setEstado(estado);
        endereco.setBairro(bairro);
        

        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setRazaosocial(razaosocial);
        cliente.setFatasia(fatasia);
        cliente.setEndereco(endereco);


        clientes = listacliente.inserir(cliente);
    }

    public void deletarCliente(Scanner scanner) {
        System.out.println("Digite o id que queira deletar: ");
        int id = scanner.nextInt();
        //cliente = new Cliente();
        clientes = listacliente.deletar(id);
    }

    public void imprimir(){
        for(Cliente c : clientes){
            c.imprimirCliente();
        }
    }

    public void alterarC(Scanner scanner){
        System.out.println("Digite o id que queira alterar: ");
        int id = scanner.nextInt();
        clientes = listacliente.alterarCliente(id);
    }
    
}
