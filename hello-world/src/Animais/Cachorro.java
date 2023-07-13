package Animais;

public class Cachorro {

    private static int numCachorros;
    private String nome;
    private double altura;
    private double peso;
    private int tamanhoDoRabo;
    private String cor;
    private String estadoDeEspirito;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPesp(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
    public String getEstadoDeEspirito(){
        return this.estadoDeEspirito;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito){
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public static int getNumCachorros() {
        return numCachorros;
    }

    public static void setNumCachorros(int numCachorros) {
        Cachorro.numCachorros = numCachorros;
    }

    public double getPeso() {
        return peso;
    }

    public Cachorro(String nome, double altura, double peso, int tamanhoDoRabo, String cor) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.cor = cor;

        numCachorros++;
    }

    public Cachorro(){}

    public void comer(){}
    public void soar(){
        System.out.println("Au Au");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao) {
//        if (acao.equalsIgnoreCase("Carinho")){
//            this.estadoDeEspirito = "Feliz";
//        } else if (acao.equalsIgnoreCase("Vai dormir")) {
//            this.estadoDeEspirito = "Bravo";
//        } else {
//            this.estadoDeEspirito = "Neutro";
//        }
        switch (acao) {
            case "Carinho": this.estadoDeEspirito = "Feliz";
            break;
            case "Pisar patinha": this.estadoDeEspirito = "Triste";
            break;
            case "Vai dormir": this.estadoDeEspirito = "Bravo";
            break;
            default: this.estadoDeEspirito = "Neutro";
            break;
        }

        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
