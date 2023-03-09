import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // cria um vetor de inteiros com tamanho 5
        int maior = Integer.MIN_VALUE; // variável para armazenar o maior valor, iniciada com o menor valor possível
        int menor = Integer.MAX_VALUE; // variável para armazenar o menor valor, iniciada com o maior valor possível
        int soma = 0; // variável para armazenar a soma dos valores
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 5 valores inteiros: ");
        
        // lê os 5 valores inteiros digitados pelo usuário e armazena no vetor
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            
            // verifica se o número lido é o maior ou o menor valor
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            
            // adiciona o valor lido à soma
            soma += numeros[i];
        }
        
        // mostra na tela os valores lidos, o maior valor, o menor valor e a média dos valores
        System.out.println("Os valores lidos foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + (double)soma/5);
        
        scanner.close();
    }
}