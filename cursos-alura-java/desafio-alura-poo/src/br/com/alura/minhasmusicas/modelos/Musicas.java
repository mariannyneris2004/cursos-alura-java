package br.com.alura.minhasmusicas.modelos;

public class Musicas extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (getTotalReproducoes() >=1000){
            return 5.0;
        } else if (getTotalReproducoes() >= 900 && getTotalReproducoes() < 1000){
            return 4.5;
        }else if (getTotalReproducoes() >= 800 && getTotalReproducoes() < 900){
            return 4.0;
        }else if (getTotalReproducoes() >= 700 && getTotalReproducoes() < 800){
            return 3.5;
        }else if (getTotalReproducoes() >= 600 && getTotalReproducoes() < 700){
            return 3.0;
        }else if (getTotalReproducoes() >= 500 && getTotalReproducoes() < 600){
            return 2.5;
        }else if (getTotalReproducoes() >= 400 && getTotalReproducoes() < 500){
            return 2.0;
        }else if (getTotalReproducoes() >= 300 && getTotalReproducoes() < 400){
            return 1.5;
        }else {
            return 1.0;
        }
    }
}
