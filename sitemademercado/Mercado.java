package sitemademercado;

import java.util.Scanner;
import java.util.ArrayList;

public class Mercado{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        boolean continuar = true; 

        while (continuar) {
            System.out.println();
            System.err.println("---Sistema de Produtos---");

            System.out.println();
            
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Lista de produtos");
            System.out.println("3. Buscar produto por codigo");
            System.out.println("4. Alterar quantidade ou preço de produto");
            System.out.println("5. Revomer produto");
            System.out.println("0. sair");

            System.out.println();

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao == 1) {
                System.out.println();
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
                System.out.println();
                System.out.println("--- SEUS PRODUTOS ---");
                System.out.println();
                if (produtos.isEmpty()) {
                    System.out.println();
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println((i + 1) + ". " + produtos.get(i));
                    }
                }
            } else if (opcao == 3) {
                System.out.println();
                System.out.print("Digite o código do produto: ");
                int codigoBusca = scanner.nextInt();
                scanner.nextLine();

                boolean encontrado = false;

                for (Produto p: produtos) {
                    if (p.getCodigo() == codigoBusca) {
                        System.out.println();
                        System.out.println("Produto encontrado: " + p);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println();
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 4) {
                System.out.println();
                System.out.print("Digite o código do produto: ");
                int codigoBusca = scanner.nextInt();
                scanner.nextLine();

                for (Produto p : produtos) {
                    if (p.getCodigo() == codigoBusca) {
                        System.out.println();
                        System.out.print("Nova quantidade: ");
                        int novaQtd = scanner.nextInt();
                        scanner.nextLine();
                        p.setQuantidade(novaQtd);
                        System.out.println();
                        System.out.println("Quantidade atualizada.");
                        break;
                    }
                }
            } else if (opcao == 5) {
                System.out.println();
                System.out.print("Digite o codigo do produto que deseja remover: ");
                int codigoBusca = scanner.nextInt();
                scanner.nextLine();

                boolean encontrado = false;

                for (Produto p: produtos) {
                    if (p.getCodigo() == codigoBusca) {
                        System.out.println();
                        System.out.println("Removendo produto...");
                        produtos.remove(p);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println();
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 0) {
                System.out.println();
                System.out.println("Saindo do Programa...");
                continuar = false;
            }
        }
    }
}