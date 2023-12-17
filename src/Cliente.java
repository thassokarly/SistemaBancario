public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;


    public Cliente() {
        this("", "", new Endereco());
    }

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome =  nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String toString() {
        return "Cliente de nome "+this.nome+", de CPF "+this.cpf +", que mora no "+ this.endereco.toString();
    }
}
