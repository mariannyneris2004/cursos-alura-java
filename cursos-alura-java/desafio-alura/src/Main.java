import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        int operacao = 0;

        System.out.println("Escreva as informações sobre o Cliente");
        System.out.println("Nome do cliente: ");
        cliente.setNomeCliente(leitura.nextLine());
        System.out.println("Tipo de conta: ");
        cliente.setTipoConta(leitura.nextLine());
        System.out.println("Saldo atual: ");
        cliente.setSaldo(leitura.nextDouble());

        System.out.println("__________________________");
        System.out.println("_____Digite sua opção_____");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Transferir valor");
        System.out.println("3 - Receber valor");
        System.out.println("4 - Sair");
        operacao = leitura.nextInt();

        while (operacao != 4){
            if (operacao == 1) {
                cliente.saldo = conta.consultarSaldo(cliente.saldo);
                System.out.println("Saldo atual é de " + cliente.saldo);
            } else if (operacao == 2) {
                double valor;
                System.out.println("Digite o valor a ser transferido: ");
                valor = leitura.nextDouble();
                cliente.saldo = conta.transferirValor(cliente.saldo, valor);
                System.out.println("Saldo atual é de " + cliente.saldo + " após transferência de " + valor);
            } else if (operacao == 3) {
                double valor;
                System.out.println("Digite o valor a ser recebido: ");
                valor = leitura.nextDouble();
                cliente.saldo = conta.receberValor(cliente.saldo, valor);
                System.out.println("Saldo atual é de " + cliente.saldo + " após receber " + valor);
            } else if (operacao != 1 || operacao != 2 || operacao != 3 || operacao != 4){
                System.out.println("Índice não consta no menu");
            } else if (operacao == 4){
                System.out.println("Obrigado pela preferência!");
            }

            System.out.println("__________________________");
            System.out.println("_____Digite sua opção_____");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir valor");
            System.out.println("3 - Receber valor");
            System.out.println("4 - Sair");
            operacao = leitura.nextInt();
        }
        System.out.println("");
        System.out.println("STATUS FINAL");
        System.out.println(cliente.toString());

    }
}