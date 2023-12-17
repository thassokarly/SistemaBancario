public class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private String cpfTitular;

    public Conta(String agencia, String numero, double saldo, String cpfTitular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cpfTitular = cpfTitular;

    }

    public Conta(){
        this("","",0.0,"");
    }

    @Override
    public String toString() {
        return "Conta da agência " + agencia + ", de número " + numero + ", com saldo " + saldo + ", e pertencente ao cliente de CPF " + cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {
        if (valor < 0){
            System.out.println("Insira um valor maior do que 0");
            return this.saldo;
        }
        this.saldo+=valor;
        return this.saldo;
    }

    public double sacar(double valor) {
        if (this.saldo>= valor) {
            this.saldo-= valor;
        }
        return this.saldo;
    }
}
