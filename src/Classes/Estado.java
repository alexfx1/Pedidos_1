package Classes;

public class Estado {
    private int numeroID=0;
    private int idEstado;
    private String nomeEstado; 
    private String uf;


    public Estado(int idEstado, String nomeEstado, String uf) {
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
        this.uf = uf;
    }

    public int getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = numeroID++;
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

    public void setUf(String uf) throws Exception{
        if(uf!=nomeEstado){
            throw new Exception("estado nao condiz com sigla!");
        } else {
        this.uf = uf;
        }
    }

    @Override
    public String toString() {
        return "Estados [id_estado=" + idEstado + ", nome_estado=" + nomeEstado + ", uf=" + uf + "]";
    }

}
