package views;

import java.util.Scanner;

public class Menu {

    public static final int CRIAR_CLIENTE = 1;
    public static final int LISTAR_CLIENTES = 3;


    public void imprimeMenu(){
        System.out.println("############ MENU DE OPCOES #############");
        System.out.println("################ Digite #################");
        System.out.println("1. Preencher Cliente ");
        System.out.println("2. Deletar cliente por id ");
        System.out.println("3. Imprimir lista de cliente ");
        System.out.println("4. Alterar dados do cliente ");
        System.out.println("5. Cadastrar produto ");
        System.out.println("6. Imprimir lista de produtos ");
        System.out.println("7. Deletar produto por id ");
        System.out.println("8. Alterar dados do produto");
        System.out.println("9. Encerrar programa");
        System.out.println("#########################################");
    }
}
