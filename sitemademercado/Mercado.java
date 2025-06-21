package sitemademercado;

import java.util.Scanner;
import java.util.ArrayList;

public class Mercado{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        boolean continuar = true; 

        while (continuar) {
            System.err.println("++/---Sistema de Produtos---");
            
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Lista de produtos");
            System.out.println("3. Buscar produto por codigo");
            System.out.println("4. Alterar quantidade ou preço de produto");
            System.out.println("5. Revomer produto");
            System.out.println("0. sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
3
            if (opcao == 1) {
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("Digite o codigo de busca do produto: ");
                int codigo = scanner.nextInt();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = scanner.nextInt();
                System.out.print("Digite o preço do produto: ");
                float preco = scanner.nextFloat();
                Produto novoProduto = new Produto(nomeProduto, codigo, quantidade, preco);
                produtos.add(novoProduto);
                System.out.println("O produto foi adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("--- SEUS PRODUTOS ---");
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println((i + 1) + ". " + produtos.get(i));
                    }
                }
            } else if (opcao == 0) {
                System.out.println("Saindo do Programa...");
                continuar = false;
            }
        }
    }
}