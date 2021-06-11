// MENU DO OPCOES PARA O USUARIO
// Pesquisar: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
// JOptionPane
package exe;
import java.util.ArrayList;
import java.util.Scanner;
import Classes.Endereco;
import Classes.Estado;
import Classes.Cliente.Cliente;
import Classes.Cliente.Lista;;



public class App {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Lista listacliente = new Lista();
        Scanner scanner = new Scanner(System.in);

        int op;
        String razaosocial = null;
        String fatasia = null;
        String nome = null;

        //Cliente cliente = new Cliente(1, nome, razaosocial, fatasia, null);
        
        do {
            System.out.println("############ MENU DE OPCOES #############");
            System.out.println("################ Digite #################");
            System.out.println("1. Preencher Cliente: ");
            System.out.println("2. Deletar lista de cliente: ");
            System.out.println("3. Imprimir lista de cliente: ");
            System.out.println("4. Encerrar programa");
            System.out.println("#########################################");
            op = scanner.nextInt();

            Estado estado = new Estado(1, "nome", "MG");
            Endereco endereco = new Endereco(1, "nomeEstado", "uf");

            switch(op){
                                   
                case 1:

                System.out.println(" \nDigite o id: ");
                int id = scanner.nextInt();
                System.out.println(" \nDigite o nome: ");
                nome = scanner.nextLine();
                System.out.println(" \nDigite a razaosocial: ");
                razaosocial = scanner.nextLine();
                System.out.println(" \nDigite a fantasia: ");
                fatasia = scanner.nextLine();

                Cliente cliente = new Cliente(id, nome, razaosocial, fatasia, endereco);
                clientes = listacliente.inserir(cliente);
                    break;

                case 2:
                    System.out.println("Digite o id que queira deletar: ");
                    id = scanner.nextInt();
                    cliente = new Cliente(id, nome, razaosocial, fatasia, endereco);
                    clientes = listacliente.deletar(id);
                    break;
                
                case 3:
                for(Cliente c : clientes){
                    System.out.println(c.toString());
                }
                    break;

                default:
                    System.out.print("\n Encerrando...");
                    break;
            }
        } while(op != 4);
        
    }
    
}
