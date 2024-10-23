//Grupo 04.
//Fellipe Pietro Rodrigues Gonçalves - 12221BSI241
//Julio Cesar de Jesus Batista - 12021BSI258
//Luis Henrique Cardoso Palhares - 12121BSI232
//Renan Furlanetto 12411BSI350

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import Departamentos.*;
import Departamentos.Produto;


public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        DayOfWeek diaDaSemana = hoje.getDayOfWeek();
        String diaDaSemanaStr = Data.getDiaDaSemana(diaDaSemana);
        // Cria um carrinho de comprar para armazenar os itens selecionados.        
        ArrayList<Produto> carrinho = new ArrayList<>();

        while (true) {
            System.out.println("Bem vindo ao Atacado! Hoje e " + diaDaSemanaStr + ""
                    + ". Escolha uma das seguintes opcoes: \n");

            System.out.println("1 - Departamento de Bebidas");
            System.out.println("2 - Departamento de Comida");
            System.out.println("3 - Departamento de Livros");
            System.out.println("4 - Departamento de Tecnologia");
            System.out.println("5 - Departamento de Saude");
            System.out.println("6 - Departamento de Roupas");
            System.out.println("7 - Verificar itens do carrinhos");
            System.out.println("8 - Deletar itens do carrinho");
            System.out.println("9 - Sair");
            System.out.println("Opção: ");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("1 - Departamento de Bebidas");
                    DptBebida dptBebida = new DptBebida();
                    List<Produto> bebidas = dptBebida.getProdutos();

                    if (diaDaSemanaStr.equals("Segunda-feira")) {
                        dptBebida.aplicarPromocao();
                    }

                    // Menu de Bebidas
                    while (true) {
                        // Listar os itens disponíveis no departamento.
                        dptBebida.listarProdutos();
                        // Pergunta ao cliente qual item deseja adicionar ao carrinho.
                        System.out.println("Selecione um item (digite o número) ou 0 para sair: ");
                        int indice = sc.nextInt();

                        // Verifica se o cliente quer sair do menu.
                        if (indice == 0) {
                            break;
                        }
                        // Adiciona o item selecionado ao carrinho.
                        if (indice >= 1 && indice <= bebidas.size()) {
                            Produto produto = bebidas.get(indice - 1);
                            carrinho.add(produto);
                            System.out.println("Item adicionado ao carrinho!");

                            if (diaDaSemanaStr.equals("Segunda-feira")) {
                                dptBebida.aplicarPromocao(carrinho, bebidas.get(indice - 1));
                            }
                        }
                        else {
                            System.out.println("Opção Invalida. Tente novamente.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("2 - Departamento de Comida");
                    DptComida dptComida = new DptComida();
                    List<Produto> comidas = dptComida.getProdutos();

                    if (diaDaSemanaStr.equals("Terca-feira")) {
                        dptComida.aplicarPromocao();
                    }

                    // Menu de Comidas
                    while (true) {
                        // Listar os itens disponíveis no departamento.
                        dptComida.listarProdutos();
                        // Pergunta ao cliente qual item deseja adicionar ao carrinho.
                        System.out.println("Selecione um item (digite o número) ou 0 para sair: ");
                        int indice = sc.nextInt();

                        // Verifica se o cliente quer sair do menu.
                        if (indice == 0) {
                            break;
                        }
                        // Adiciona o item selecionado ao carrinho.
                        else if (indice >= 1 && indice <= comidas.size()) {
                            Produto produto = comidas.get(indice - 1);
                            carrinho.add(produto);
                            System.out.println("Item adicionado ao carrinho!");
                            if (diaDaSemanaStr.equals("Terca-feira")) {
                                dptComida.aplicarPromocao(carrinho);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("3 - Departamento de Livros");
                    DptLivros dptLivros = new DptLivros();
                    List<Produto> livros = dptLivros.getProdutos();

                    if (diaDaSemanaStr.equals("Quarta-feira")) {
                        dptLivros.aplicarPromocao();
                    }

                    // Menu de Livros
                    while (true) {
                        // Listar os itens disponíveis no departamento.
                        dptLivros.listarProdutos();
                        // Pergunta ao cliente qual item deseja adicionar ao carrinho.
                        System.out.println("Selecione um item (digite o número) ou 0 para sair: ");
                        int indice = sc.nextInt();

                        // Verifica se o cliente quer sair do menu.
                        if (indice == 0) {
                            break;
                        }
                        // Adiciona o item selecionado ao carrinho.
                        else if (indice >= 1 && indice <= livros.size()) {
                            Produto produto = livros.get(indice - 1);
                            carrinho.add(produto);
                            System.out.println("Item adicionado ao carrinho!");
                        }

                    }
                    break;
                case 4:
                    System.out.println("4 - Departamento de Tecnologia");
                    DptTecnologia dptTecnologia = new DptTecnologia();
                    List<Produto> tecnologia = dptTecnologia.getProdutos();

                    if (diaDaSemanaStr.equals("Quinta-feira")) {
                        dptTecnologia.aplicarPromocao();
                    }

                    // Menu de Tecnologia
                    while (true) {
                        // Listar os itens disponíveis no departamento.
                        dptTecnologia.listarProdutos();
                        // Pergunta ao cliente qual item deseja adicionar ao carrinho.
                        System.out.println("Selecione um item (digite o número) ou 0 para sair: ");
                        int indice = sc.nextInt();
                        // Verifica se o cliente quer sair do menu.
                        if (indice == 0) {
                            break;
                        }
                        // Adiciona o item selecionado ao carrinho.
                        else if (indice >= 1 && indice <= tecnologia.size()) {
                            Produto produto = tecnologia.get(indice - 1);
                            carrinho.add(produto);
                            System.out.println("Item adicionado ao carrinho!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("5 - Departamento de Saude");
                    DptSaude dptSaude = new DptSaude();
                    List<Produto> saude = dptSaude.getProdutos();

                    if (diaDaSemanaStr.equals("Sexta-feira")) {
                        dptSaude.aplicarPromocao();
                    }

                    // Menu de Saude
                    while (true) {
                        // Listar os itens disponíveis no departamento.
                        dptSaude.listarProdutos();
                        // Pergunta ao cliente qual item deseja adicionar ao carrinho.
                        System.out.println("Selecione um item (digite o número) ou 0 para sair: ");
                        int indice = sc.nextInt();
                        // Verifica se o cliente quer sair do menu.
                        if (indice == 0) {
                            break;
                        }
                        // Adiciona o item selecionado ao carrinho.
                        else if (indice >= 1 && indice <= saude.size()) {
                            Produto produto = saude.get(indice - 1);
                            carrinho.add(produto);
                            System.out.println("Item adicionado ao carrinho!");
                        }
                    }
                    break;

                case 6:
                    System.out.println("6 - Departamento de Roupas");
                    DptRoupa dptRoupa = new DptRoupa();
                    List<Produto> roupa = dptRoupa.getProdutos();

                    if (diaDaSemanaStr.equals("Sabado")) {
                        dptRoupa.aplicarPromocao();
                    }

                    // Menu de Roupa
                    while (true) {
                        // Listar os itens disponíveis no departamento.
                        dptRoupa.listarProdutos();
                        // Pergunta ao cliente qual item deseja adicionar ao carrinho.
                        System.out.println("Selecione um item (digite o número) ou 0 para sair: ");
                        int indice = sc.nextInt();
                        // Verifica se o cliente quer sair do menu.
                        if (indice == 0) {
                            break;
                        }
                        // Adiciona o item selecionado ao carrinho.
                        else if (indice >= 1 && indice <= roupa.size()) {
                            Produto produto = roupa.get(indice - 1);
                            carrinho.add(produto);
                            System.out.println("Item adicionado ao carrinho!");
                        }
                    }
                case 7:
                    System.out.println("Itens do carrinho:");
                    double total = 0;
                    for (int i = 0; i < carrinho.size(); i++) {
                        Produto produto = carrinho.get(i);
                        System.out.println((i + 1) + ". " + produto.getNome() + " - R$ " + produto.getPreco());
                        total += produto.getPreco();
                    }
                    System.out.println("Total: R$ " + total);
                    break;
                case 8:
                    System.out.println("Remover item do carrinho:");
                    System.out.println("Itens do carrinho:");
                    for (int i = 0; i < carrinho.size(); i++) {
                        Produto produto = carrinho.get(i);
                        System.out.println((i + 1) + ". " + produto.getNome() + " - R$ " + produto.getPreco());
                    }
                    System.out.print("Digite o número do item que deseja remover: ");
                    int indice = sc.nextInt();
                    if (indice >= 1 && indice <= carrinho.size()) {
                        carrinho.remove(indice - 1);
                        System.out.println("Item removido com sucesso!");
                    }else {
                        System.out.println("Índice inválido. Tente novamente.");
                    }
                    break;
            }

            if (opcao == 9) {
                System.out.println("Obrigado por visitar o Atacado!");
                break;
            }

        }
    }
}



