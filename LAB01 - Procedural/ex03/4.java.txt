import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[6]; // cria um vetor de inteiros com tamanho 6
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 6 números pares: ");
        
        // lê os 6 valores inteiros pares digitados pelo usuário e armazena no vetor
        int i = 0;
        while (i < 6) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                numeros[i] = num;
                i++;
            } else {
                System.out.println("Erro: Valor inválido");
            }
        }
        
        // mostra na tela os valores lidos
        System.out.println("Os valores lidos foram: ");
        for (int j = 0; j < 6; j++) {
            System.out.println(numeros[j]);
        }
        
        scanner.close();
    }
}