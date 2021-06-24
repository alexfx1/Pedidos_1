package classes.pedido;

import classes.produto.Produto;

public class ItemPedido {
    private int idItem;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;
    private float valor;
    private float desconto;

    public ItemPedido() {
    }

    public int getIdItem() {
        return this.idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}

