package exe;
import java.util.Scanner;
import views.CadastroCliente;
import views.CadastroProduto;
import views.Menu;
import views.MenuPedido;

import static views.Menu.CRIAR_CLIENTE;
import static views.Menu.LISTAR_CLIENTES;
import static views.Menu.DELETAR_CLIENTE;
import static views.Menu.ALTERAR_CLIENTE;
import static views.Menu.CADASTRAR_PRODUTO;
import static views.Menu.IMPRIMIR_PRODUTO;
import static views.Menu.DELETAR_PRODUTO;
import static views.Menu.ALTERAR_PRODUTO;
import static views.Menu.FAZER_PEDIDO;



public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CadastroCliente cadastroCliente = new CadastroCliente();
        CadastroProduto cadastroProduto = new CadastroProduto();

        String op;
        
        do {
            Menu menu = new Menu();
            menu.imprimeMenu();
            MenuPedido menuPedido = new MenuPedido();
            op = scanner.nextLine();
            
            switch(op) {       
                
                case CRIAR_CLIENTE:
                    cadastroCliente.cadastroC(scanner);
                    break;
                

                case DELETAR_CLIENTE:
                    cadastroCliente.deletarCliente(scanner);
                    break;
                
                case LISTAR_CLIENTES:
                    cadastroCliente.imprimir();
                    break;
                

                case ALTERAR_CLIENTE:
                    cadastroCliente.alterarC(scanner);
                    break;
                
                case CADASTRAR_PRODUTO:
                    cadastroProduto.cadastroP(scanner);
                    break;

                case IMPRIMIR_PRODUTO:
                    cadastroProduto.imprimirP();                   
                    break;
                
                case DELETAR_PRODUTO: 
                    cadastroProduto.deletarProdut(scanner);
                    break;

                case ALTERAR_PRODUTO:
                    cadastroProduto.alterarP(scanner);
                    break;

                case FAZER_PEDIDO:
                    menuPedido.opcoesMenuPedido(scanner);
                    break;

                default:
                    /*if(op.matches("[a-z]*") || op.matches("[A-Z]*")) {
                        System.out.print("\n Digite uma opcao novamente! Ou encerre");
                    } 
                    else {
                    System.out.print("\n Encerrando...");
                    }*/
                    System.out.print("\n ...");
                    break;
            }
        } while(!op.equals("9"));
        scanner.close();    
    }    
}