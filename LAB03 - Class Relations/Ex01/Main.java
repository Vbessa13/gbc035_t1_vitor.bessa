public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 123, "São Paulo", "SP");
        Endereco endereco2 = new Endereco("Rua B", 456, "São Paulo", "SP");
        Endereco[] enderecos = {endereco1, endereco2};

        Pessoa pessoa = new Pessoa("João", enderecos);
        pessoa.exibirEnderecos();
    }
}
