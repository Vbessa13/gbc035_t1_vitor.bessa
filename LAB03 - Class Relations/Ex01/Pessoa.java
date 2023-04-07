public class Pessoa {
    private String nome;
    private Endereco[] enderecos;

    public Pessoa(String nome, Endereco[] enderecos) {
        this.nome = nome;
        this.enderecos = enderecos;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void exibirEnderecos() {
        for (Endereco endereco : enderecos) {
            System.out.println(endereco.toString());
        }
    }
}


