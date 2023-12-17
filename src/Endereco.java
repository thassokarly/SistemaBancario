public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String numero, String bairro, String cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    public Endereco(){
        this("","","","","","");
    }

    @Override
    public String toString() {
        return "Endereço: " + logradouro + ", numero " + numero + ", bairro " + bairro + ", cep " + cep + ", cidade " + cidade + ", estado " + estado;
    }
}
