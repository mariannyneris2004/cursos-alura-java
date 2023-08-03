import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Compras {
    double saldoCartao;

    public Compras(double saldoCartao){
        this.saldoCartao = saldoCartao;
    }

    public String comprar(double preco){
        if (preco < saldoCartao){
            saldoCartao -= preco;
            return "Compra realizada!";
        }
        return "Saldo insuficiente!";
    }

    public void ordenarItens(ArrayList<Item> itens){
        itens.sort(Comparator.comparing(Item::getValor));
    }
}
