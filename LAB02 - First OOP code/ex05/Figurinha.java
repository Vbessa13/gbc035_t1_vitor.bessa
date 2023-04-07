public class Figurinha {
    private String nomeJogador;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String pais) {
        this.nomeJogador = "Sem nome";
        this.dataNascimento = LocalDate.of(1990, 1, 1);
        this.altura = 1.7;
        this.peso = 70.0;
        this.posicao = "Sem posição";
        this.pais = pais;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
