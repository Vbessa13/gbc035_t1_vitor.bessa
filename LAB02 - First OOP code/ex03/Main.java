public class Main {
    public static void main(String[] args) {
        Figurinha[] figurinhas = new Figurinha[3];

        figurinhas[0] = new Figurinha("Neymar Jr.", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        figurinhas[1] = new Figurinha("Lionel Messi", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        figurinhas[2] = new Figurinha("Cristiano Ronaldo", "05/02/1985", 1.87, 83.0, "Atacante", "Portugal");

        for (int i = 0; i < figurinhas.length; i++) {
            System.out.println("Figurinha " + (i+1) + ":");
            System.out.println("Nome do Jogador: " + figurinhas[i].getNome());
            System.out.println("Data de Nascimento: " + figurinhas[i].getDataNascimento());
            System.out.println("Altura: " + figurinhas[i].getAltura());
            System.out.println("Peso: " + figurinhas[i].getPeso());
            System.out.println("Posição: " + figurinhas[i].getPosicao());
            System.out.println("País: " + figurinhas[i].getPais());
            System.out.println();
        }
    }
}
