package br.com.alura.minhasmusicas.modelos;

public class Podcasts extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (getTotalCurtidas() >=1000){
            return 5.0;
        } else if (getTotalCurtidas() >= 900 && getTotalCurtidas() < 1000){
            return 4.5;
        }else if (getTotalCurtidas() >= 800 && getTotalCurtidas() < 900){
            return 4.0;
        }else if (getTotalCurtidas() >= 700 && getTotalCurtidas() < 800){
            return 3.5;
        }else if (getTotalCurtidas() >= 600 && getTotalCurtidas() < 700){
            return 3.0;
        }else if (getTotalCurtidas() >= 500 && getTotalCurtidas() < 600){
            return 2.5;
        }else if (getTotalCurtidas() >= 400 && getTotalCurtidas() < 500){
            return 2.0;
        }else if (getTotalCurtidas() >= 300 && getTotalCurtidas() < 400){
            return 1.5;
        }else {
            return 1.0;
        }
    }
}
