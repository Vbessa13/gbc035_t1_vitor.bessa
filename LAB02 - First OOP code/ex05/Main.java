public class Main {
    public static void main(String[] args) {

        Selecao brasil = new Selecao("Brasil", "Tite");
        Selecao argentina = new Selecao("Argentina", "Lionel Scaloni");

        Figurinha[] jogadoresSelecao1 = new Figurinha[11];
        jogadoresSelecao1[0] = new Figurinha("Brasil");
        jogadoresSelecao1[0].setNomeJogador("Alisson");
        jogadoresSelecao1[0].setDataNascimento("02/10/1992");
        jogadoresSelecao1[0].setAltura(1.93);
        jogadoresSelecao1[0].setPeso(92.0);
        jogadoresSelecao1[0].setPosicao("Goleiro");

        jogadoresSelecao1[1] = new Figurinha("Brasil");
        jogadoresSelecao1[1].setNomeJogador("Danilo");
        jogadoresSelecao1[1].setDataNascimento("15/07/1991");
        jogadoresSelecao1[1].setAltura(1.84);
        jogadoresSelecao1[1].setPeso(78.0);
        jogadoresSelecao1[1].setPosicao("Lateral Direito");

        jogadoresSelecao1[2] = new Figurinha("Brasil");
        jogadoresSelecao1[2].setNomeJogador("Thiago Silva");
        jogadoresSelecao1[2].setDataNascimento("22/09/1984");
        jogadoresSelecao1[2].setAltura(1.83);
        jogadoresSelecao1[2].setPeso(79.0);
        jogadoresSelecao1[2].setPosicao("Zagueiro");

        jogadoresSelecao1[3] = new Figurinha("Brasil");
        jogadoresSelecao1[3].setNomeJogador("Marquinhos");
        jogadoresSelecao1[3].setDataNascimento("14/05/1994");
        jogadoresSelecao1[3].setAltura(1.83);
        jogadoresSelecao1[3].setPeso(75.0);
        jogadoresSelecao1[3].setPosicao("Zagueiro");

        jogadoresSelecao1[4] = new Figurinha("Brasil");
        jogadoresSelecao1[4].setNomeJogador("Alex Sandro");
        jogadoresSelecao1[4].setDataNascimento("26/01/1991");
        jogadoresSelecao1[4].setAltura(1.76);
        jogadoresSelecao1[4].setPeso(78.0);
        jogadoresSelecao1[4].setPosicao("Lateral Esquerdo");

        jogadoresSelecao1[5] = new Figurinha("Brasil");
        jogadoresSelecao1[5].setNomeJogador("Casemiro");
        jogadoresSelecao1[5].setDataNascimento("23/02/1992");
        jogadoresSelecao1[5].setAltura(1.85);
        jogadoresSelecao1[5].setPeso(84.0);
        jogadoresSelecao1[5].setPosicao("Volante");


        System.out.println("Seleção do Brasil:");
        brasil.mostrarInformacoes();

        System.out.println("\nSeleção da Argentina:");
        argentina.mostrarInformacoes();
    }
}