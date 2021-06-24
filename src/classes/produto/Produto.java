package classes.produto;

public class Produto extends Marca {
    private int idProduto;
    private String descricao;
    private float valor;
    private float desconto;
    private Marca marca;


    public Produto() {
    }


    public int getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void imprimirProduto(){
        System.out.println(" \n ---------- Produto ----------");
        System.out.println("Id: " + this.idProduto);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("valor: " + this.valor);
        System.out.println("desconto: " + this.desconto);
        marca.imprimirMarca();
    }

    

    /*public Produto(String descricao, float valor, float desconto) {
        super(idMarca);
    }    

    public void set_id(int idProduto){

    }*/

}
