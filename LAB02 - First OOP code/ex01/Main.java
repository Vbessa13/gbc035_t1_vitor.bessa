public class Main {
    public static void main(String[] args) {
        Figurinha figurinha1 = new Figurinha("Neymar Jr.", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        Figurinha figurinha2 = new Figurinha("Lionel Messi", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        Figurinha figurinha3 = new Figurinha("Cristiano Ronaldo", "05/02/1985", 1.87, 83.0, "Atacante", "Portugal");

        System.out.println("Figurinha 1:\n" + figurinha1);
        System.out.println("\nFigurinha 2:\n" + figurinha2);
        System.out.println("\nFigurinha 3:\n" + figurinha3);
    }
}
