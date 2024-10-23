package Departamentos;
import java.util.List;

import Departamentos.Produto;

public class DptRoupa extends Departamentos {
    public DptRoupa() {
        super("Roupas");
        armazenarProduto("Camiseta", 50.00);
        armazenarProduto("Calça Jeans", 120.00);
        armazenarProduto("Blusa de Frio", 80.00);
        armazenarProduto("Tênis", 150.00);

    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Promoção de roupas! Todos os produtos com 15% de desconto.");
        for (Produto produto : produtos) {
            double preco = produto.getPreco();
            produto.setPreco(preco * 0.85);  // Aplica desconto de 15%
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
