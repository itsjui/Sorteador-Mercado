package Departamentos;

import java.util.List;

public class DptComida extends Departamentos {
    public DptComida() {
        super("Comida");
        armazenarProduto("Arroz", 25.00);
        armazenarProduto("Feijão", 10.00);
        armazenarProduto("Açúcar", 4.00);
        armazenarProduto("Macarrão", 5.00);

    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Promoção de comida! Desconto de 5% em compras acima de R$ 50.");

    }

    public void aplicarPromocao(List<Produto> carrinho) {
        double total = 0;
        for (Produto produto : carrinho) {
            total += produto.getPreco();
        }

        if (total > 50 && !descontoAplicado) {
            System.out.println("Você atingiu o valor mínimo de R$ 50,00! Seus produtos terão um desconto de 5% aplicado.");
            double desconto = total * 0.05;
            System.out.println("Desconto de R$ " + desconto);
            // Atualiza o preço dos produtos com o desconto
            for (Produto produto : produtos) {
                produto.setPreco(produto.getPreco() - (produto.getPreco() * 0.05));
            }
            descontoAplicado = true;
        }
    }
    public List<Produto> getProdutos() {
        return produtos;
    }

    private boolean descontoAplicado = false;
}

