package classes.cliente;

public class Cliente {
    private int id;
    private String razaosocial; 
    private String fatasia;
    private Endereco endereco;
    
    //private int qtdClientes = 0;

    /*public Cliente(int id, String nome, String razaosocial, String fatasia, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.razaosocial = razaosocial;
        this.fatasia = fatasia;
        this.endereco = endereco;
    }*/

    public Cliente(){
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaosocial() {
        return this.razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getFatasia() {
        return this.fatasia;
    }

    public void setFatasia(String fatasia) {
        this.fatasia = fatasia;
    }

    public Endereco getEndereco() {
        //tratamento de null pointer
        return this.endereco == null ? new Endereco() : this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimirCliente(){
        System.out.println(" \n ---------- Cliente ----------");
        System.out.println("Id: " + this.id);
        System.out.println("razaosocial: " + this.razaosocial);
        System.out.println("fantasia: " + this.fatasia);
        endereco.imprimeEndereco();
    }
        
}