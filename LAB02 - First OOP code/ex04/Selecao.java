public class Selecao {
    private String nomeSelecao;
    private Figurinha[] titulares = new Figurinha[11];
    private String nomeTecnico;
    private int anoFundacao;

    public Selecao(String nomeSelecao, Figurinha[] titulares, String nomeTecnico, int anoFundacao) {
        this.nomeSelecao = nomeSelecao;
        this.titulares = titulares;
        this.nomeTecnico = nomeTecnico;
        this.anoFundacao = anoFundacao;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public Figurinha[] getTitulares() {
        return titulares;
    }

    public void setTitulares(Figurinha[] titulares) {
        this.titulares = titulares;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public void mostrarInfo() {
        System.out.println("Seleção: " + nomeSelecao);
        System.out.println("Técnico: " + nomeTecnico);
        System.out.println("Ano de Fundação: " + anoFundacao);
        System.out.println("Titulares:");
        for (int i = 0; i < titulares.length; i++) {
            System.out.println("Jogador " + (i+1) + ":");
            titulares[i].mostrarInfo();
            System.out.println();
        }
    }
}
