package classes.cliente;

public class Endereco {
    private int idEndereco;
    private String logradouro; 
    private int numero;
    private String quadra;
    private float lote;
    private Estado estado;
    private String bairro;
    
    public Endereco(){
    }

    public int getId() {
        return this.idEndereco;
    }

    public void setId(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuadra() {
        return this.quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public float getLote() {
        return this.lote;
    }

    public void setLote(float lote) {
        this.lote = lote;
    }

    public Estado getEstado() {
        return this.estado == null ? new Estado() : this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void imprimeEndereco(){
        System.out.println(" \n ---------- Endereco ----------");
        System.out.println("Id do endereco: " + this.idEndereco);
        System.out.println("logradouro: " + this.logradouro);
        System.out.println("numero: " + this.numero);
        System.out.println("quadra: " + this.quadra);
        System.out.println("lote: " + this.lote);
        System.out.println("bairro: " + this.bairro);
        estado.imprimeEstado();
        
    }
    
}
