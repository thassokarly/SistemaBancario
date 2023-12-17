import javax.swing.*;

public class Main {
    public static void main(String [] args) {


        SistemaBancario sistema = new SistemaBancario();

        boolean continuar = true;
        while(continuar) {
            String opcao = JOptionPane.showInputDialog("Digite uma opção: \n1. Cadastrar cliente\n2.Pesquisar cliente\n3.Criar conta\n4.Consultar saldo de conta\n8.Sair");
            if (opcao.equals("1")) {
                //TODO: FAZER CADASTRO DO CLIENTE
                String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente");
                String nomeRua = JOptionPane.showInputDialog("Digite o logradouro do endereço do cliente (Rua/Avenida...)");
                String numero = JOptionPane.showInputDialog("Digite o número)");
                String bairro = JOptionPane.showInputDialog("Digite o bairro");
                String cep = JOptionPane.showInputDialog("Digite o cep");
                String cidade = JOptionPane.showInputDialog("Digite o nome da cidade");
                String estado = JOptionPane.showInputDialog("Digite o estado");
                boolean cadastrou = sistema.cadastrarCliente(nome, cpf, new Endereco(nomeRua, numero, bairro, cep, cidade, estado));
                if (cadastrou) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao cadastrar cliente. Fale com o banco");
                }
            } else if (opcao.equals("2")) {
                //FAZER PESQUISA DE CLIENTE PELO CPF
                String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente a pesquisar");
                Cliente clienteEncontrado = sistema.pesquisarCliente(cpf);
                if (clienteEncontrado == null) {
                    JOptionPane.showMessageDialog(null, "Não foi encontrado cliente com este CPF");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente encontrado:"+clienteEncontrado.toString());
                }
            } else if (opcao.equals("3")) {
                String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia");
                String numConta = JOptionPane.showInputDialog("Digite o número da conta");
                String cpf =  JOptionPane.showInputDialog("Digite o cpf do titular da conta");
                boolean criou = sistema.criarConta(numAgencia, numConta, cpf);
                if (criou) {
                    JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao cadastrar conta. Fale com o banco");
                }
            } else if (opcao.equals("4")){
                String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia");
                String numConta = JOptionPane.showInputDialog("Digite o número da conta");
                double valorSaldo = sistema.pesquisarSaldo(numAgencia, numConta);
                JOptionPane.showMessageDialog(null, "O saldo da conta "+numConta+" da agência "+numAgencia+ " é "+valorSaldo);
            }else if (opcao.equals("8")) {

                continuar = false;
                JOptionPane.showMessageDialog(null, "Até mais!");
            }
        }
        System.out.println("FIM DO PROGRAMA");


    }

}
