package classes;

import java.util.Scanner;

public class Endereco {
    private int idEndereco;
    private String logradouro; 
    private int numero;
    private String quadra;
    private float lote;
    private Estado estado;
    private String bairro;
    private int contador=0;
    
    public Endereco(){
    }

    public int getId() {
        return this.idEndereco;
    }

    public void setId(int id) {
        this.idEndereco = contador++;
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

    public void cadastroEndereco(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n ---------- Endereco ----------");
        System.out.println(" \nDigite a idEndereco: ");
        int idEndereco = scanner.nextInt();
        System.out.println(" \nDigite o logradouro: ");
        String logradouro = scanner.next();
        System.out.println(" \nDigite o numero: ");
        int numero = scanner.nextInt();
        System.out.println(" \nDigite a quadra: ");
        String quadra = scanner.next();
        System.out.println(" \nDigite o lote(numero): ");
        float lote = scanner.nextFloat();
        //estado
        System.out.println(" \nDigite o bairro: ");
        String bairro = scanner.next();

        Endereco endereco = new Endereco();
        endereco.setId(idEndereco);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setQuadra(quadra);
        endereco.setLote(lote);
        endereco.setEstado(estado);
        endereco.setBairro(bairro);
        
        scanner.close();
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

    /*@Override //imprimir
	public String toString() {
		return "Enderecos [id_endereco=" + idEndereco + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", quadra=" + quadra + ", lote=" + lote + ", bairro=" + bairro + ", uf=" + idEstado + "]";
	} */
    
}
