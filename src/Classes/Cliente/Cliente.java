package Classes.Cliente;

import Classes.Endereco;

public class Cliente {
    private int id;
    private String nome;
    private String razaosocial; 
    private String fatasia;
    private Endereco endereco = new Endereco();
    private int qtdClientes = 0;

    public Cliente(int id, String nome, String razaosocial, String fatasia, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.razaosocial = razaosocial;
        this.fatasia = fatasia;
        this.endereco = endereco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQtdClientes() {
        return this.qtdClientes;
    }

    public void setQtdClientes(int qtdClientes) {
        this.qtdClientes = qtdClientes++;
    }


}