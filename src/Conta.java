public class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private String cpfTitular;

    public Conta() {
        this("", "", 0.0, "");
    }

    public Conta(String agencia, String numero, double saldo, String cpfTitular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cpfTitular = cpfTitular;
    }

    public String toString() {
        return "Conta da agência "+this.agencia+", de número "
                +this.numero+" com saldo " + this.saldo
                +" e pertencente ao cliente de CPF "+ this.cpfTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double depositar(double valor) {
        this.saldo+=valor;
        return this.saldo;
    }

    public double sacar(double valor) {
        if (this.saldo>= valor) {
            this.saldo-= valor;
        }
        return this.saldo;
    }

    public String getNumeroAgencia() {
        return this.agencia;
    }

    public String getNumeroConta() {
        return this.numero;
    }

    public void setNumeroAgencia(String numeroAg) {
        this.agencia = numeroAg;
    }

    public void setNumeroConta(String numeroConta) {
        this.numero = numeroConta;
    }
}
