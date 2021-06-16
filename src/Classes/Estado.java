package classes;

import java.util.Scanner;

public class Estado {
    private int idEstado;
    private String nomeEstado; 
    private String uf;


    public Estado() {
    }

    public int getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    /*public void setUf(String uf) throws Exception{
        if(uf!=nomeEstado){
            throw new Exception("estado nao condiz com sigla!");
        } else {
        this.uf = uf;
        }
    }*/

    public void imprimeEstado(){
        System.out.println(" \n ---------- Estado ----------");
        System.out.println("Id do endereco: " + this.idEstado);
        System.out.println("logradouro: " + this.nomeEstado);
        System.out.println("numero: " + this.uf);
        System.out.println(" \n ############################");
    }

    public void cadastroEstado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n ---------- Estado ----------");
        System.out.println(" \nDigite o idEstado: ");
        int idEstado = scanner.nextInt();
        System.out.println(" \nDigite o nome do estado: ");
        String nomeEstado = scanner.next();
        System.out.print(" \nDigite a uf: ");
        String uf = scanner.next();

        Estado estado = new Estado();
        estado.setIdEstado(idEstado);
        estado.setNomeEstado(nomeEstado);
        estado.setUf(uf);
        scanner.close();
    } 

}
