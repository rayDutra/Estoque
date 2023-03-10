import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        System.out.println();
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(produtos.get(i));
                System.out.println("Dados do produto " + nome + " foram removidos");
            }
        }
    }

    public void pesquisarProduto(String nome) {
        System.out.println();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                System.out.println(produto);
            }
        }
    }

    public void registrarEntrada(String nome, int quantidade) {
        System.out.println();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println(produto);
            }
        }
    }

    public void registrarSaida(String nome, int quantidade) {
        System.out.println();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println(produto);
                } else {
                    System.out.println("Estoque  do " + nome + " não possui quantidade requerida");
                    System.out.println();
                }
            }
        }
    }

    public void verificarEstoque() {
        System.out.println();
        if (produtos.isEmpty()) {
            System.out.println("Estoque não possui nenhum produto registrado");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public boolean check(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
}

