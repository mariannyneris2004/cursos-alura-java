package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 4.5){
            System.out.println(audio.getTitulo() + " é um sucesso e ouvido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção para se ouvir!");
        }
    }
}
