package Animais;

public class Gato {
    private static int numGatos;
    private String nome;
    private double altura;
    private double peso;
    private int tamanhoDoRabo;
    private String cor;
    private String estadoDeEspirito;

    public Gato(String nome, double altura, double peso, int tamanhoDoRabo, String cor, String estadoDeEspirito) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.cor = cor;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public static int getNumGatos() {
        return numGatos;
    }

    public static void setNumGatos(int numGatos) {
        Gato.numGatos = numGatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void comer(){}

    public void dormir(){}

    public void soar(){
        System.out.println("Miau miau");
    }
}
