import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[6]; // cria um vetor de inteiros com tamanho 6
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 6 valores inteiros: ");
        
        // lê os 6 valores inteiros digitados pelo usuário e armazena no vetor
        for (int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        // mostra na tela os valores lidos
        System.out.println("Os valores lidos foram: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(numeros[i]);
        }
        
        scanner.close();
    }
}