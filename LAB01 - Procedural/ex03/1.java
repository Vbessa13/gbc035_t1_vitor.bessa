import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[6]; // cria um vetor de inteiros com tamanho 6
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 6 valores inteiros: ");
        
        // lê os 6 valores inteiros digitados pelo usuário e armazena no vetor
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();
        numeros[3] = scanner.nextInt();
        numeros[4] = scanner.nextInt();
        numeros[5] = scanner.nextInt();
        
        // mostra na tela os valores lidos
        System.out.println("Os valores lidos foram: ");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
        
        scanner.close();
    }
}
