import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com o número de alunos (no máximo 100): ");
        int numAlunos = scanner.nextInt();
        
        if (numAlunos > 100) {
            System.out.println("Erro: número de alunos inválido!");
            return;
        }
        
        double[] notas = new double[numAlunos]; // cria um vetor de notas com tamanho numAlunos
        
        System.out.println("Digite as notas dos alunos: ");
        
        // lê as notas digitadas pelo usuário e armazena no vetor
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // calcula a média das notas
        double soma = 0;
        for (int i = 0; i < numAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / numAlunos;
        
        // mostra na tela a média das notas
        System.out.println("Média das notas: " + media);
        
        // mostra na tela as notas de todos os alunos
        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
        
        scanner.close();
    }
}