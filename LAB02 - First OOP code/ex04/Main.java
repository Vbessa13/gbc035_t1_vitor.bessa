public class Main {
    public static void main(String[] args) {
        Figurinha[] titularesBrasil = new Figurinha[11];
        titularesBrasil[0] = new Figurinha("Neymar Jr.", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        titularesBrasil[1] = new Figurinha("b1", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[2] = new Figurinha("b2", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[3] = new Figurinha("b3", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[4] = new Figurinha("b4", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[5] = new Figurinha("b5", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[6] = new Figurinha("b6", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[7] = new Figurinha("b7", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[8] = new Figurinha("b8", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[9] = new Figurinha("b9", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");
        titularesBrasil[10] = new Figurinha("b10", "02/10/1991", 1.81, 76.0, "Atacante", "Brasil");

        Selecao brasil = new Selecao("Brasil", titularesBrasil, "Tite", 1914);

        Figurinha[] titularesArgentina = new Figurinha[11];
        titularesArgentina[0] = new Figurinha("Lionel Messi", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[1] = new Figurinha("a1", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[2] = new Figurinha("a2", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[3] = new Figurinha("a3", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[4] = new Figurinha("a4", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[5] = new Figurinha("a5", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[6] = new Figurinha("a6", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[7] = new Figurinha("a7", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[8] = new Figurinha("a8", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[9] = new Figurinha("a9", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");
        titularesArgentina[10] = new Figurinha("a10", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina");


        Selecao argentina = new Selecao("Argentina", titularesArgentina, "Lionel Scaloni", 1901);

        System.out.println("Informações da Seleção do Brasil:");
        brasil.mostrarInfo();

        System.out.println("\nInformações da Seleção da Argentina:");
        argentina.mostrarInfo();
    }
}
