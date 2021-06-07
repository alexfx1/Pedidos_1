// MENU DO OPCOES PARA O USUARIO
// Pesquisar: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
// JOptionPane
import java.util.Scanner;

import Classes.Cliente.Cliente;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("############ MENU DE OPCOES #############");
        System.out.println("#########################################");
        System.out.println("############# PREENCHER CLIENTE #########");
        System.out.println("1. NOME: ");
        
        String valorDigitado = scanner.nextLine();
        System.out.println("valorDigitado: " + valorDigitado);

       //Cliente cliente = new Cliente();

        //Cliente.class.getName() = scanner.nextLine();
        //String nome;
        //nome = cliente.getNome();

        

        System.out.print("\n\n############################");
        System.out.print("\n\n############################");
    }
}
