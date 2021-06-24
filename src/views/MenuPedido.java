package views;

import java.util.Scanner;

public class MenuPedido {
    
    public void imprimeMenuPedido(){
        System.out.println("\n\n\n");
        System.out.println("#############  FACA O PEDIDO ############");
        System.out.println("################ Digite #################");
        System.out.println("1. Cadastrar Pedido");
        System.out.println("s. Voltar ao menu principal");
        System.out.println("#########################################");
    }

    public void opcoesMenuPedido(Scanner scanner){
        String op;
        CadastroPedido cadastroPedido = new CadastroPedido();

        do {

            imprimeMenuPedido();
            op = scanner.nextLine();
            switch(op){

                case "1":
                    cadastroPedido.cadastrarP();
                    break;

                default:
                    System.out.println("Voltando ao menu principal");
                    break;
            }

        }while(!op.equals("s"));
    }
}
