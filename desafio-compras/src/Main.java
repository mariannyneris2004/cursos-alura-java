import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 1;
        ArrayList<Item> itens = new ArrayList<>();
        String statusCompra;
        System.out.println("Digite o limite do cartão: ");
        Compras compras = new Compras(scanner.nextDouble());

        do {
            if (operacao == 1){
                System.out.println("Digite a descrição da compra: ");
                String nome = scanner.next();
                System.out.println("Digite o valor da compra: ");
                double preco = scanner.nextDouble();

                Item item = new Item(nome, preco);
                statusCompra = compras.comprar(item.getValor());

                System.out.println(statusCompra);

                if(statusCompra.equals("Compra realizada!")){
                    itens.add(item);
                    System.out.println("Digite 0 para sair ou 1 para continuar");
                    operacao = scanner.nextInt();
                } else {
                    operacao = 0;
                }
            }
        } while (operacao != 0);

        compras.ordenarItens(itens);
        System.out.println("**********************\nCOMPRAS REALIZADAS:\n");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i).getNome() + " - " + itens.get(i).getValor());
        }
        System.out.println("\n**********************\n");

        System.out.println("Saldo do cartão: " + compras.saldoCartao);
        scanner.close();
    }
}