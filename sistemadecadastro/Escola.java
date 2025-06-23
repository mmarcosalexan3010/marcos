package sistemadecadastro;

import java.util.Scanner;
import java.util.ArrayList;

public class Escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("---Sistema de Cadastro---");

            System.out.println("1. Cadastrar novo aluno");
            System.out.println("2. Lista de alunos");
            System.out.println("3. Buscar aluno por matricula");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                
            } else if (opcao == 0) {
                System.out.println("Saindo...");
                continuar = false;
            }
        }
    }
    
}