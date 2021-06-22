package exe;
import java.util.Scanner;
import views.CadastroCliente;
import views.CadastroProduto;
import views.Menu;



public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CadastroCliente cadastroCliente = new CadastroCliente();
        CadastroProduto cadastroProduto = new CadastroProduto();

        int op;

        
        do {
            Menu menu = new Menu();
            menu.imprimeMenu();
            op = scanner.nextInt();
            
            switch(op){
                            
                
                case 1:
                    cadastroCliente.cadastroC(scanner);
                    break;
                

                case 2:
                    cadastroCliente.deletarCliente(scanner);
                    break;
                
                case 3:
                    cadastroCliente.imprimir();
                    break;
                

                case 4:
                    cadastroCliente.alterarC(scanner);
                    break;
                
                case 5:
                    cadastroProduto.cadastroP(scanner);
                    break;

                case 6:
                    cadastroProduto.imprimirP();                   
                    break;
                
                case 7: 
                    cadastroProduto.deletarProdut(scanner);
                    break;

                case 8:
                    cadastroProduto.alterarP(scanner);
                    break;

                default:
                    System.out.print("\n Encerrando...");
                    break;
            }
        } while(op != 9);
        scanner.close();    
    }
    
}