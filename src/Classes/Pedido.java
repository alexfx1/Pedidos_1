package classes;


public class Pedido extends Marca{
    private int idPedido;
    public String statusPedido;
    public float descontoPedido;
    public float frete;

    public Pedido() {
    }



    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public float getDescontoPedido() {
        return this.descontoPedido;
    }

    public void setDescontoPedido(float descontoPedido) {
        this.descontoPedido = descontoPedido;
    }

    public float getFrete() {
        return this.frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }


    /*public Pedido(int idMarca, String descricaoMarca) {
        super(idMarca,descricaoMarca);
        this.idPedido = idPedido;
        this.statusPedido(statusPedido);
        this.frete(frete);
    }*/
    
    

    //Lista Item Pedido == colocar outra classe
}
