package classes.produto;
import java.util.ArrayList;

public class ListaProdutos {
    public ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public ArrayList<Produto> inserir(Produto produt) {
		listaProduto.add(produt);
		return listaProduto;
	}
}
