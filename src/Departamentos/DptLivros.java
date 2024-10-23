package Departamentos;

import java.util.List;

public class DptLivros extends Departamentos {
    public DptLivros() {
        super("Livros");
        armazenarProduto("Livro: O Caçador de Pipas", 30.00);
        armazenarProduto("Livro: 1984", 40.00);
        armazenarProduto("Livro: O Senhor dos Anéis", 50.00);
        armazenarProduto("Livro: Dom Casmurro", 35.00);

    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Promoção de livros! Todos os produtos com 25% de desconto.");
        for (Produto produto : produtos) {
            double preco = produto.getPreco();
            produto.setPreco(preco * 0.75);  // Aplica desconto de 25%
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}


