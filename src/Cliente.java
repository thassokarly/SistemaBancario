public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Cliente(){
        this("","",new Endereco());
    }

    @Override
    public String toString() {
        return "Cliente de nome" + nome + ", cpf " + cpf + ", endereco " + endereco;
    }
}
