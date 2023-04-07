public class Figurinha {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String nome, String dataNascimento, double altura, double peso, String posicao, String pais) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nAltura: " + altura +
                "\nPeso: " + peso +
                "\nPosição: " + posicao +
                "\nPaís: " + pais;
    }
}
