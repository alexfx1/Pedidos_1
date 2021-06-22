package classes.produto;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos {
    public ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public ArrayList<Produto> inserir(Produto produt) {
		listaProduto.add(produt);
		return listaProduto;
	}

	public Produto buscaProdutoID(int idProduto){
		for(Produto produto : listaProduto){
			if(produto.getIdProduto() == idProduto){
				System.out.println("produto encontrado\n");
				return produto;
			} 
		}
		return new Produto();
	}

	public ArrayList<Produto> alterarProduto(int idProduto){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a descricao: ");
		String descricao = scanner.next();
		System.out.println("Digite o novo valor: ");
		float valor = scanner.nextFloat();
		System.out.println("Digite o novo desconto: ");
		float desconto = scanner.nextFloat();

		Produto produto = buscaProdutoID(idProduto);
		produto.setDescricao(descricao);
		produto.setValor(valor);
		produto.setDesconto(desconto);

		scanner.close();
		return listaProduto;
	}

	public ArrayList<Produto> deletarProduto(int idProduto){
		for(Produto produto : listaProduto){
			if(produto.getIdProduto() == idProduto){
				listaProduto.remove(produto);
			}
		}
		System.out.println("produto com id nao encontrado!");
		return listaProduto;
	}
}
