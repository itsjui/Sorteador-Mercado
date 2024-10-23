package Departamentos;
import java.util.*;

import Interfaces.Atacado;
import Interfaces.Distribuicao;
import Departamentos.*;

public abstract class Departamentos implements Atacado, Distribuicao {
    protected String nomeDepartamento;
    protected List<Produto> produtos = new ArrayList<>();

    public Departamentos(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    @Override
    public void armazenarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
        System.out.println(nome + " foi armazenado no departamento de " + nomeDepartamento);
    }

    @Override
    public boolean verificarDisponibilidade(String nome) {
        return produtos.stream().anyMatch(produto -> produto.getNome().equals(nome));
    }

    @Override
    public void listarProdutos() {
        System.out.println("Produtos disponíveis no departamento de " + nomeDepartamento + ":");
        for (int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
            System.out.println((i + 1) + "." + produto.getNome() + " - Preço: R$ " + produto.getPreco());
        }
    }
    // Metodo para aplica promoções baseado em dias da semana.
    public abstract void aplicarPromocao();

    // Método para obter o preço de um produto específico
    public double obterPreco(String nome) {
        return produtos.stream()
                .filter(produto -> produto.getNome().equals(nome))
                .map(Produto::getPreco)
                .findFirst()
                .orElse(0.0);
    }
}
