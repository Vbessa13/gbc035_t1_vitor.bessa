import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numeros = new double[5]; // cria um vetor de números com tamanho 5
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 5 números: ");
        
        // lê os 5 números digitados pelo usuário e armazena no vetor
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        // calcula a média dos números
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += numeros[i];
        }
        double media = soma / 5;
        
        // calcula o desvio padrão amostral dos números
        double somaQuadradosDesvios = 0;
        for (int i = 0; i < 5; i++) {
            somaQuadradosDesvios += Math.pow(numeros[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadradosDesvios / 4);
        
        // mostra na tela a média e o desvio padrão amostral dos números
        System.out.println("Média: " + media);
        System.out.println("Desvio padrão amostral: " + desvioPadrao);
        
        scanner.close();
    }
}