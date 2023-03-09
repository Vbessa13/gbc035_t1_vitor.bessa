import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] notas = new int[5]; // cria um vetor de inteiros com tamanho 5
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as notas dos 5 alunos: ");
        
        // lê as notas dos 5 alunos digitadas pelo usuário e armazena no vetor
        for (int i = 0; i < 5; i++) {
            notas[i] = scanner.nextInt();
        }
        
        // encontra a maior nota entre as notas lidas
        int maiorNota = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        
        // normaliza as notas dividindo cada nota pela maior nota e multiplicando por 100
        for (int i = 0; i < 5; i++) {
            notas[i] = notas[i] * 100 / maiorNota;
        }
        
        // mostra na tela as notas normalizadas
        System.out.println("Notas normalizadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]);
        }
        
        scanner.close();
    }
}