package Departamentos;
import java.util.List;

import Departamentos.Produto;

public class DptTecnologia extends Departamentos {
    public DptTecnologia() {
        super("Tecnologia");
        armazenarProduto("Smartphone", 1000.00);
        armazenarProduto("Notebook", 3000.00);
        armazenarProduto("Tablet", 600.00);
        armazenarProduto("Fone de Ouvido Bluetooth", 200.00);

    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Promoção de tecnologia! Desconto de 20% em todos os produtos.");
        for (Produto produto : produtos) {
            double preco = produto.getPreco();
            produto.setPreco(preco * 0.80);  // Aplica desconto de 20%
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
