package Classes;
import java.util.ArrayList;

public class Marca {
    protected int idMarca;
    protected String descricaoMarca;
    public int count;

    public int getId(){
        return idMarca;
    }

    public void set_id(int idMarca){
        this.idMarca = count++;
    }

    /*public String setDescricaoMarca(){

    }*/
    
    public String getDescricaoMarca(String descricaoMarca){
        return descricaoMarca;
    }

    /*public Marca(int idMarca) throws Exception {
        this.set_Id(idMarca);
        this.setDescricao(descricaoMarca);
    }*/
}
