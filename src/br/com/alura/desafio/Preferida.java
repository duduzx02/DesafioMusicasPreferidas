package br.com.alura.desafio;

public class Preferida {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            if (audio.getClass().equals(Musica.class)) {
                System.out.println(audio.getTitulo() + " essa música é considerado sucesso absoluto e preferido por " +
                        "todos!");
            } else {
                System.out.println(audio.getTitulo() + " esse podcast é considerado sucesso absoluto e preferido por " +
                        "todos!");
            }
        } else {
            if (audio.getClass().equals(Musica.class)) {
                System.out.println(audio.getTitulo() + " essa música também é um dos que todo mundo está curtindo");
            } else {
                System.out.println(audio.getTitulo() + " esse podcast também é um dos que todo mundo está curtindo");
            }
        }
    }
}





