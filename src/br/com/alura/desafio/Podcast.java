package br.com.alura.desafio;

public class Podcast extends Audio{
    private String apresentador;
    private String desricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDesricao() {
        return desricao;
    }

    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    @Override
    public int getClassificacao() {
        if(getCurtidas() > 150){
            return 10;
        } else{
            return 7;
        }
    }
}
