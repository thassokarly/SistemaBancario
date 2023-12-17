public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco() {
        this("","", "", "", "", "");
    }

    public Endereco(String logradouro, String numero, String bairro,
                    String cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return "endereço: "+this.logradouro+","+this.numero +" - "+this.bairro+" - "+ this.cidade+" - "+this.estado +", CEP: "+this.cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;

    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;

    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.cep;

    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getEstado() {
        return this.estado;

    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;

    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
