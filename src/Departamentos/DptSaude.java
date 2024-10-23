package Departamentos;
import java.util.List;

import Departamentos.Produto;

public class DptSaude extends Departamentos {
    public DptSaude() {
        super("Saúde");
        armazenarProduto("Vitamina C", 30.00);
        armazenarProduto("Máscara", 5.00);
        armazenarProduto("Sabonete", 4.00);
        armazenarProduto("Dipirona", 15.00);
    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Promoção de saúde! Todos os produtos com 10% de desconto.");
        for (Produto produto : produtos) {
            double preco = produto.getPreco();
            produto.setPreco(preco * 0.90);  // Aplica desconto de 10%
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
