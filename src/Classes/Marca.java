package classes;

public class Marca {
    private int idMarca;
    private String descricaoMarca;


    public Marca() {
    }

    public int getIdMarca() {
        return this.idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescricaoMarca() {
        return this.descricaoMarca;
    }

    public void setDescricaoMarca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
    }

    public void imprimirMarca(){
        System.out.println(" \n ---------- Marca ----------");
        System.out.println("Id: " + this.idMarca);
        System.out.println("Descricao: " + this.descricaoMarca);
        System.out.println(" \n ###########################");
    }

}