package br.com.alura.minhasmusicas.princial;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.Podcasts;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.setTitulo("Singular");
        musica.setArtista("Anavitória");

        for (int i = 1; i <= 1000; i++) {
            musica.curtir();
        }

        for (int i = 1; i <= 7000; i++) {
            musica.reproduzir();
        }

        Podcasts podcast = new Podcasts();
        podcast.setTitulo("Sinapse");
        podcast.setHost("Pedro Loos e Greg");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            podcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);
    }
}