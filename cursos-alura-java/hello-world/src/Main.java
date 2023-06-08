import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Flor");
        cachorro1.setCor("Caramelo");
        cachorro1.setAltura(40);
        cachorro1.setPeso(7.9);
        cachorro1.setTamanhoDoRabo(25);

        System.out.println(cachorro1.getNumCachorros());

        Cachorro cachorro2 = new Cachorro("Maya", 30, 8.9, 30, "Marrom");

        System.out.println(cachorro2.getNumCachorros());
        System.out.println(cachorro1.getNumCachorros());

        System.out.println(cachorro1.pegar());

        System.out.println(cachorro1.interagir("Carinho"));
        System.out.println(cachorro1.interagir("Vai dormir"));
        System.out.println(cachorro1.interagir("Nada"));
        System.out.println(cachorro1.interagir("Pisar patinha"));

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }
}