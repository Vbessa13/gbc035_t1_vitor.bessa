public class Selecao {
    private String nomeSelecao;
    private Figurinha[] jogadoresTitulares;
    private String nomeTecnico;

    public Selecao(String nomeSelecao, String nomeTecnico, String pais) {
        this.nomeSelecao = nomeSelecao;
        this.nomeTecnico = nomeTecnico;
        this.jogadoresTitulares = new Figurinha[11];
        for (int i = 0; i < 11; i++) {
            this.jogadoresTitulares[i] = new Figurinha(pais);
        }
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public Figurinha[] getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public void setJogadoresTitulares(Figurinha[] jogadoresTitulares) {
        this.jogadoresTitulares = jogadoresTitulares;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }
}
