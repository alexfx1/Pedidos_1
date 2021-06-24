package classes.pedido;

import classes.cliente.Cliente;
import classes.cliente.Estado;
import enums.StatusPedido;

public class Pedido {
    private int idPedido;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private double desconto;
    private double frete;
    private ItemPedido itemPedido;
    Estado estado = new Estado();

    public Pedido() {
    }


    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public StatusPedido getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    //pegou cliente pelo id
    public int getCliente() {
        return this.cliente.getId();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /*public int getIdCliente(){
        return this.client.getId();
    }

    public int setIdCliente(int idCliente){
        this.idCliente = client.getId();
    }*/

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getFrete() {
        return this.frete;
    }

    public void setFrete(double frete) {
        if(estado.getUf().equals("MG")){
            this.frete = frete*1.3;
        } 
        else if(estado.getUf().equals("GO")){
            this.frete = frete*1.1;
        }
        else if(estado.getUf().equals("TO")){
            this.frete = frete*1.5;
        }
        else {
            this.frete = frete;
        }
    }

    //pegou item pelo id
    public int getItemPedido() {
        return this.itemPedido.getIdItem();
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

}