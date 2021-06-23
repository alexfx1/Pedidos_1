package views;

public class Menu {

    public static final String CRIAR_CLIENTE = "1";
    public static final String DELETAR_CLIENTE = "2";
    public static final String LISTAR_CLIENTES = "3";
    public static final String ALTERAR_CLIENTE = "4";
    public static final String CADASTRAR_PRODUTO = "5";
    public static final String IMPRIMIR_PRODUTO = "6";
    public static final String DELETAR_PRODUTO = "7";
    public static final String ALTERAR_PRODUTO = "8";


    public void imprimeMenu(){
        System.out.println("\n\n\n\n");
        System.out.println("############ MENU DE OPCOES #############");
        System.out.println("################ Digite #################");
        System.out.println("1. Preencher Cliente ");
        System.out.println("2. Deletar cliente por id ");
        System.out.println("3. Imprimir lista de cliente ");
        System.out.println("4. Alterar dados do cliente ");
        System.out.println("5. Cadastrar produto ");
        System.out.println("6. Imprimir lista de produtos ");
        System.out.println("7. Deletar produto por id ");
        System.out.println("8. Alterar dados do produto");
        System.out.println("9. Encerrar programa");
        System.out.println("#########################################");
    }
}
