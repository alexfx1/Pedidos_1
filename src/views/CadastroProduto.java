package views;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.produto.ListaProdutos;
import classes.produto.Marca;
import classes.produto.Produto;

public class CadastroProduto {
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    ListaProdutos listaProdutos = new ListaProdutos();
    int cont=1;
    int cont1=1;

    public void cadastroP(Scanner scanner) {
        try {
        System.out.println(" \n ---------- Produto ----------");
        //System.out.println(" \nDigite o idProduto: ");
        //int idProduto = scanner.nextInt();
        System.out.println(" \nDigite a descricao: ");
        String descricao = scanner.next();
        System.out.println(" \nDigite o valor: ");
        float valor = scanner.nextFloat();
        System.out.println(" \n Desconto: ");
        float desconto = scanner.nextFloat();

        System.out.println(" \n ---------- Marca ----------");
        //System.out.println(" \nDigite o idMarca: ");
        //int idMarca = scanner.nextInt();
        System.out.println(" \nDigite a descricao da marca: ");
        String descricaoMarca = scanner.next();


        Marca marca = new Marca();
        marca.setIdMarca(cont1);
        cont1++;
        marca.setDescricaoMarca(descricaoMarca);

        Produto produto = new Produto();
        produto.setIdProduto(cont);
        cont++;
        produto.setDescricao(descricao);
        produto.setValor(valor);
        produto.setDesconto(desconto);
        produto.setMarca(marca);

        produtos = listaProdutos.inserir(produto);
        }
        catch (Exception e){
            System.out.println("digito invalido!");
        }
    }

    public void imprimirP(){
        for(Produto p : produtos){
            p.imprimirProduto();
        }
    }

    public void deletarProdut(Scanner scanner) {
        System.out.println("Digite o id do produto que queira deletar: ");
        try {
        int idProduto = scanner.nextInt();
        //cliente = new Cliente();
        produtos = listaProdutos.deletarProduto(idProduto);
        }
        catch(InputMismatchException erro){
            System.err.println("idproduto invatlido");
        }
    }

    public void alterarP(Scanner scanner){
        try {
        System.out.println("Digite o id do produto que queira alterar: ");
        int idProduto = scanner.nextInt();
        produtos = listaProdutos.alterarProduto(idProduto);
        } catch (Exception e) {
            System.out.println("digito invalido!");
        }
    }
}
