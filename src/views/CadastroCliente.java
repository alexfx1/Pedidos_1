package views;
import classes.cliente.Cliente;
import classes.cliente.Endereco;
import classes.cliente.Estado;
import classes.cliente.Lista;
import java.util.InputMismatchException;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    Lista listacliente = new Lista();
    int contador=1;
    int contador1=1;
    int contador2=1;
    
    public void cadastroC(Scanner scanner){
        try {
        System.out.println(" \n ---------- Cliente ---------- ");
        //System.out.println(" \nDigite o id: ");
        //int id = scanner.nextInt();
        System.out.println(" \nDigite a razaosocial: ");
        String razaosocial = scanner.next();
        System.out.println(" \nDigite a fantasia: ");
        String fatasia = scanner.next();
        //endereco
        
        System.out.println(" \n ---------- Endereco ----------");
        //System.out.println(" \nDigite a idEndereco: ");
        //int idEndereco = scanner.nextInt();
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
        //System.out.println(" \nDigite o idEstado: ");
        //int idEstado = scanner.nextInt();
        System.out.println(" \nDigite o nome do estado: ");
        String nomeEstado = scanner.next();
        System.out.println(" \nDigite a uf: ");
        String uf = scanner.next();




        Estado estado = new Estado();
        estado.setIdEstado(contador2);
        contador2++;
        estado.setNomeEstado(nomeEstado);
        estado.setUf(uf);

        Endereco endereco = new Endereco();
        endereco.setId(contador1);
        contador1++;
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setQuadra(quadra);
        endereco.setLote(lote);
        endereco.setEstado(estado);
        endereco.setBairro(bairro);
        

        Cliente cliente = new Cliente();
        cliente.setId(contador);
        contador++;
        cliente.setRazaosocial(razaosocial);
        cliente.setFatasia(fatasia);
        cliente.setEndereco(endereco);


        clientes = listacliente.inserir(cliente);
        }

        catch (Exception e){
            System.out.println("caractere com erro");
        }
    }

    public void deletarCliente(Scanner scanner) {
        try {
        System.out.println("Digite o id que queira deletar: ");
        
        int id = scanner.nextInt();
        clientes = listacliente.deletar(id);
        } 
        catch (InputMismatchException err){
            System.err.println("caractere!");
        }
        //cliente = new Cliente();
    }

    public void imprimir(){
        for(Cliente c : clientes){
            c.imprimirCliente();
        }
    }

    public void alterarC(Scanner scanner){
        try {
        System.out.println("Digite o id que queira alterar: ");
        int id = scanner.nextInt();
        clientes = listacliente.alterarCliente(id);
        } catch (Exception ex){
            System.out.println("digito invalido!");
        }
    }

}
