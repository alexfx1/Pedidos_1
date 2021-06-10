package Classes;

public class Endereco extends Estado{
    private int idEndereco;
    private String logradouro; 
    private int numero;
    private String quadra;
    private float lote;
    private Estado estado;
    private String bairro;
    private int contador=0;
    

    public Endereco(int idEndereco, String logradouro, int numero, String quadra, float lote, Estado estado, String bairro, int idEstado) throws Exception{
        super(idEstado);
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setQuadra(quadra);
        this.setLote(lote);
        this.setEstado(estado);
        this.setBairro(bairro);
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
        return this.estado;
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

    /*@Override //imprimir
	public String toString() {
		return "Enderecos [id_endereco=" + idEndereco + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", quadra=" + quadra + ", lote=" + lote + ", bairro=" + bairro + ", uf=" + idEstado + "]";
	} */


}
