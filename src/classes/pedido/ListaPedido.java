package classes.pedido;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPedido {
    public ArrayList<Pedido> listaPedido = new ArrayList<Pedido>();
    Scanner scanner = new Scanner(System.in);

    public  ArrayList<Pedido> adicionarP(Pedido pedido){
        listaPedido.add(pedido);
        return listaPedido;
    }

    public ArrayList<Pedido> deletarPedido(int idPedido){
        for(Pedido p : listaPedido){
            if(p.getIdPedido() == idPedido){
                listaPedido.remove(p);
            }
        }
        System.out.println("id do pedido nao encontrado");
        return listaPedido;
    }

    public ArrayList<Pedido> buscaIdPedido(int idPedido){
        for(Pedido p : listaPedido){
            if(p.getIdPedido() == idPedido){
                return listaPedido;
            }
        }
        return listaPedido;
    }

    public ArrayList<Pedido> alterarPedido(int idBusca){
        System.out.println("Digite o novo desconto do pedido: ");
        double descontoP = scanner.nextDouble();
        System.out.println("Digite o novo valor frete do pedido: ");
        double freteP = scanner.nextDouble();

        Pedido pedido = new Pedido();
        pedido.setDesconto(descontoP);
        pedido.setFrete(freteP);
        return listaPedido;
    }
}
