import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    //private static Estoque estoque = new Estoque();
    public static void main(String[] args) {
        int op = -1;
        long i = 0;
        Estoque estoque = new Estoque();
        while (op != 7) {
            menu();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    i++;
                    estoque.adicionarProduto(adicionar(i));
                    break;
                case 2:
                    System.out.println();
                    System.out.printf("Digite nome do produto que deseja remover: ");
                    String nomeRemover = sc.nextLine();
                    if (estoque.check(nomeRemover)){
                        estoque.removerProduto(nomeRemover);
                    } else {
                        System.out.println();
                        System.out.println("Esse produto não possui dados cadastrados");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.printf("Digite nome do produto que deseja pesquisar: ");
                    String nomePesquisar = sc.nextLine();
                    if (estoque.check(nomePesquisar)){
                        estoque.pesquisarProduto(nomePesquisar);
                    } else {
                        System.out.println();
                        System.out.println("Esse produto não possui dados cadastrados");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.printf("Digite nome do produto que deseja fazer alteração: ");
                    String nomeEntrada = sc.nextLine();
                    if (estoque.check(nomeEntrada)) {
                        System.out.printf("Digite quantidade que de itens que vão ser inseridos: ");
                        int quantidade = Integer.parseInt(sc.nextLine());
                        estoque.registrarEntrada(nomeEntrada, quantidade);
                    } else {
                        System.out.println();
                        System.out.println("Esse produto não possui dados cadastrados");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.printf("Digite nome do produto que deseja fazer alteração: ");
                    String nomeSaida = sc.nextLine();
                    if (estoque.check(nomeSaida)) {
                        System.out.printf("Digite quantidade que de itens que vão ser retirados: ");
                        int quantidade = Integer.parseInt(sc.nextLine());
                        estoque.registrarSaida(nomeSaida, quantidade);
                    } else {
                        System.out.println();
                        System.out.println("Esse produto não possui dados cadastrados");
                        System.out.println();
                    }
                    break;
                case 6:
                    estoque.verificarEstoque();
                    break;
                case 7:
                    System.out.println("FIM DO PROGRAMA!");
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }

    public static void menu() {
        System.out.println("--------------Menu--------------");
        System.out.println("1. Adicionar produto estoque");
        System.out.println("2. Remover produto do estoque");
        System.out.println("3. Pesquisar determinado produto");
        System.out.println("4. Registar entrada de mercadoria");
        System.out.println("5. Registar saída de mercadoria");
        System.out.println("6. Listar estoque");
        System.out.println("7. Sair");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.printf("Digite opção desejada: ");
    }

    public static Produto adicionar(long i) {
        System.out.println();
        System.out.println("Cadastre os dados do produto");
        System.out.printf("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.printf("Digite o preço do produto: ");
        double preco = Double.parseDouble(sc.nextLine());
        ;
        System.out.printf("Digite a quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine());
        System.out.println();
        return new Produto(i, nome, preco, quantidade);
    }

}




