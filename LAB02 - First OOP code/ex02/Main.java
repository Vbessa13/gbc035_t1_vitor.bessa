public class Main {
    public static void main(String[] args) {
        Figurinha figurinha1 = new Figurinha("Neymar Jr.", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        Figurinha figurinha2 = new Figurinha("Lionel Messi", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        Figurinha figurinha3 = new Figurinha("Cristiano Ronaldo", "05/02/1985", 1.87, 83.0, "Atacante", "Portugal");

        System.out.println("Antes da alteração:");
        System.out.println("Figurinha 1:");
        figurinha1.mostrarInfo();
        System.out.println("\nFigurinha 2:");
        figurinha2.mostrarInfo();
        System.out.println("\nFigurinha 3:");
        figurinha3.mostrarInfo();

        // Alterando valores dos atributos
        figurinha1.setAltura(1.78);
        figurinha1.setPeso(70.0);
        figurinha2.setPais("Espanha");
        figurinha3.setPosicao("Meio-Campo");
    }
}


