// MENU DO OPCOES PARA O USUARIO
// Pesquisar: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
// JOptionPane
package exe;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Endereco;
import classes.Estado;
import classes.Marca;
import classes.cliente.Cliente;
import classes.cliente.Lista;
import classes.produto.Produto;
import classes.produto.ListaProdutos;



public class App {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Lista listacliente = new Lista();
        ListaProdutos listaProdutos = new ListaProdutos();
        Scanner scanner = new Scanner(System.in);

        int op;

        
        do {
            System.out.println("############ MENU DE OPCOES #############");
            System.out.println("################ Digite #################");
            System.out.println("1. Preencher Cliente: ");
            System.out.println("2. Deletar lista de cliente: ");
            System.out.println("3. Imprimir lista de cliente: ");
            System.out.println("4. Alterar dados do cliente: ");
            System.out.println("5. Cadastrar produto: ");
            System.out.println("6. Imprimir lista de produtos: ");
            System.out.println("7. Encerrar programa");
            System.out.println("#########################################");
            op = scanner.nextInt();
            

            switch(op){
                            
                
                case 1:
                //----> ClienteAux.getClientes(); //Pesquisar singleton java
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
                    break;
                

                case 2:
                    System.out.println("Digite o id que queira deletar: ");
                    id = scanner.nextInt();
                    //cliente = new Cliente();
                    clientes = listacliente.deletar(id);
                    break;
                
                case 3:
                for(Cliente c : clientes){
                    c.imprimirCliente();
                }
                    break;
                

                case 4:
                    System.out.println("Digite o id que queira alterar: ");
                    id = scanner.nextInt();
                    clientes = listacliente.alterarCliente(id);
                    break;
                
                case 5:
                System.out.println(" \n ---------- Produto ----------");
                System.out.println(" \nDigite o idProduto: ");
                int idProduto = scanner.nextInt();
                System.out.println(" \nDigite a descricao: ");
                String descricao = scanner.next();
                System.out.println(" \nDigite o valor: ");
                float valor = scanner.nextFloat();
                System.out.println(" \n Desconto: ");
                float desconto = scanner.nextFloat();

                System.out.println(" \n ---------- Marca ----------");
                System.out.println(" \nDigite o idMarca: ");
                int idMarca = scanner.nextInt();
                System.out.println(" \nDigite a descricao: ");
                String descricaoMarca = scanner.next();


                Marca marca = new Marca();
                marca.setIdMarca(idMarca);
                marca.setDescricaoMarca(descricaoMarca);

                Produto produto = new Produto();
                produto.setIdProduto(idProduto);
                produto.setDescricao(descricao);
                produto.setValor(valor);
                produto.setDesconto(desconto);
                produto.setMarca(marca);

                produtos = listaProdutos.inserir(produto);
                    break;

                case 6:
                for(Produto p : produtos){
                    p.imprimirProduto();
                }                   
                    break;

                default:
                    System.out.print("\n Encerrando...");
                    break;
            }
        } while(op != 7);
        scanner.close();    
    }
    
}