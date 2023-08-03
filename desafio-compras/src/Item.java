public class Item implements Comparable<Item>{
    String nome;
    double valor;

    public Item(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Item item) {
        if (this.valor > item.getValor()) {
            return -1;
        } if (this.valor < item.getValor()) {
            return 1;
        }
        return 0;
    }
}
