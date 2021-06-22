package views;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Marca;
import classes.produto.ListaProdutos;
import classes.produto.Produto;

public class CadastroProduto {
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    ListaProdutos listaProdutos = new ListaProdutos();

    public void cadastroP(Scanner scanner) {
        System.out.println(" \n ---------- Produto ----------");
        System.out.println(" \nDigite o idProduto: ");
        int idProduto = scanner.nextInt();
        System.out.println(" \nDigite a descricao: ");
        String descricao = scanner.next();
        System.out.println(" \nDigite o valor: ");
        float valor = scanner.nextFloat();
        System.out.println(" \n Desconto: ");
        float desconto = scanner.nextFloat();

        System.out.println(" \n ---------- Marca ----------");
        System.out.println(" \nDigite o idMarca: ");
        int idMarca = scanner.nextInt();
        System.out.println(" \nDigite a descricao: ");
        String descricaoMarca = scanner.next();


        Marca marca = new Marca();
        marca.setIdMarca(idMarca);
        marca.setDescricaoMarca(descricaoMarca);

        Produto produto = new Produto();
        produto.setIdProduto(idProduto);
        produto.setDescricao(descricao);
        produto.setValor(valor);
        produto.setDesconto(desconto);
        produto.setMarca(marca);

        produtos = listaProdutos.inserir(produto);
    }

    public void imprimirP(){
        for(Produto p : produtos){
            p.imprimirProduto();
        }
    }

    public void deletarProdut(Scanner scanner) {
        System.out.println("Digite o id do produto que queira deletar: ");
        int idProduto = scanner.nextInt();
        //cliente = new Cliente();
        produtos = listaProdutos.deletarProduto(idProduto);
    }

    public void alterarP(Scanner scanner){
        System.out.println("Digite o id do produto que queira alterar: ");
        int idProduto = scanner.nextInt();
        produtos = listaProdutos.alterarProduto(idProduto);
    }
}
