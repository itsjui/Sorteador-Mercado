package Departamentos;

import java.util.List;

public class DptBebida extends Departamentos {
    public DptBebida() {
        super("Bebidas");
        armazenarProduto("Cerveja", 10.00);
        armazenarProduto("Refrigerante", 5.00);
        armazenarProduto("Vodka", 30.00);
        armazenarProduto("Suco Natural", 8.00);

    }

    public void aplicarPromocao(List<Produto> carrinho, Produto produto) {
        int quantidade = 0;
        for (Produto p : carrinho) {
            if (p.equals(produto)) {
                quantidade++;
            }
        }
        if (quantidade % 2 == 0) {
            Produto produtoGratuito = new Produto(produto.getNome(), 0.0);
            carrinho.add(produtoGratuito);
            System.out.println("Você ganhou uma bebida gratuita!");
        }
    }
    @Override
    public void aplicarPromocao() {
        System.out.println("Promoção de bebidas! Compre 2 e leve 1 de graça.");
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
