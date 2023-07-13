import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        int operacao;

        System.out.println("Consulta bancária:\n\nEscreva seu nome:");
        cliente.nomeCliente = scanner.nextLine();
        System.out.println("Escreva seu tipo de conta: ");
        cliente.tipoConta = scanner.nextLine();
        System.out.println("Escreva seu saldo atual: ");
        cliente.saldo = scanner.nextDouble();

        do {
            System.out.println("\n1 - Consultar saldo\n2 - Transferir\n" +
                    "3 - Receber\n0 - Finalizar\n\nEscreva a operação que deseja realizar:");
            operacao = scanner.nextInt();

            if (operacao == 1){
                cliente.saldo = conta.consultarSaldo(cliente.saldo);
                System.out.println(cliente.toString());
            } else if (operacao == 2) {
                double valorTransferencia;
                System.out.println("Informe o valor a ser transferido: ");
                valorTransferencia = scanner.nextDouble();
                cliente.saldo = conta.transferirValor(cliente.saldo, valorTransferencia);
                System.out.println(cliente.toString());
            } else if (operacao == 3) {
                double valorAReceber;
                System.out.println("Informe o valor a ser recebido: ");
                valorAReceber = scanner.nextDouble();
                cliente.saldo = conta.receberValor(cliente.saldo, valorAReceber);
                System.out.println(cliente.toString());
            } else{
                System.out.println("Obrigado pela preferência!\n\n");
            }
        } while (operacao != 0);


        scanner.close();
    }
}