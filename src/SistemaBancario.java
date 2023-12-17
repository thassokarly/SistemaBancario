import java.util.ArrayList;

public class SistemaBancario {

    private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;

    public SistemaBancario() {

        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();

    }


    public boolean existeConta(String numAgencia, String numConta) {
        for (Conta c: this.contas) {
            if (c.getNumeroAgencia().equals(numAgencia) && c.getNumeroConta().equals(numConta) ) {
                return true;
            }
        }
        return false;
    }

    public boolean criarConta(String numAgencia, String numConta, String cpfTitular) {
        if (existeConta(numAgencia, numConta)) {
            return false;
        } else {
            Conta c = new Conta(numAgencia, numConta, 0.0, cpfTitular);
            this.contas.add(c);
            return true;
        }
    }

    public double pesquisarSaldo(String numAgencia, String numConta) {
        for (Conta c: this.contas) {
            if (c.getNumeroAgencia().equals(numAgencia) && c.getNumeroConta().equals(numConta)) {
                return c.getSaldo();
            }
        }
        return 0.0;
    }
    public Cliente pesquisarCliente(String cpf) {
        for (Cliente c: this.clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }
    public boolean cadastrarCliente(String nome, String cpf, Endereco endereco) {
        Cliente c = pesquisarCliente(cpf);
        if (c==null) {
            Cliente novoCliente = new Cliente(nome, cpf, endereco);
            this.clientes.add(novoCliente);
            return true;
        } else {
            return false;
        }
    }

}
