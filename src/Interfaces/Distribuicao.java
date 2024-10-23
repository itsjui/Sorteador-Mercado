package Interfaces;

public interface Distribuicao {
    // Método para armazenar um produto, com nome e preço
    void armazenarProduto(String nome, double preco);

    // Método para verificar a disponibilidade de um produto
    boolean verificarDisponibilidade(String nome);

    // Método para listar todos os produtos disponíveis
    void listarProdutos();
}
