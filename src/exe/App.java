// MENU DO OPCOES PARA O USUARIO
// Pesquisar: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
// JOptionPane
package exe;
import java.util.ArrayList;
import java.util.Scanner;
import Classes.Endereco;
import Classes.Estado;
import Classes.Cliente.Cliente;


public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Cliente> clientes = new ArrayList<>Cliente();
        int op;
        String razaosocial = null;
        String fatasia = null;
        String nome = null;
        //Cliente cliente = new Cliente(1, nome, razaosocial, fatasia, null);
        
        do {
            System.out.println("############ MENU DE OPCOES #############");
            System.out.println("################ Digite #################");
            System.out.println("1. Preencher Cliente: ");
            System.out.println("2. Imprimir lista de cliente: ");
            System.out.println("#########################################");
            op = scanner.nextInt();

            Estado estado = new Estado(1, "nome", "MG");
            //Endereco endereco1 = new Endereco("1", "Rua Paris", 1300, "quadra", 13.5f,  estado, "bairro");
            Cliente cliente = new Cliente(1, nome, razaosocial, fatasia, null);

            switch(op){
                                   
                case 1:
                System.out.println(" Digite o nome: ");
                nome = scanner.nextLine();
                System.out.println(" Digite a razaosocial: ");
                razaosocial = scanner.nextLine();
                System.out.println(" Digite a fantasia: ");
                fatasia = scanner.nextLine();
                    break;

                case 2:
                System.out.println(cliente.printCliente());
                System.out.print("\n############################");
                System.out.print("\n\n############################");
                    break;

                default:
                    System.out.print("\n Encerrando...");
                    break;
            }
        } while(op != 3);
        
    }
}
