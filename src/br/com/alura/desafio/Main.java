package br.com.alura.desafio;

public class Main {
    public static void main(String[] args) {
        Musica SaudadeDeRosa = new Musica();
        Preferida preferida = new Preferida();


        SaudadeDeRosa.setTitulo("Saudade de Rosa");
        SaudadeDeRosa.setCantor("Bartô Galeno");
        SaudadeDeRosa.setGenero("Brega");

        Podcast flow = new Podcast();
        flow.setTitulo("Flow");
        flow.setApresentador("Igor 3k");
        flow.setDescricao("Entrevista todo mundo!");

        for (int i = 0; i < 2500; i++) {
            SaudadeDeRosa.curte();
            SaudadeDeRosa.reproduz();
        }

        for (int i = 0; i < 25; i++) {
            flow.curte();
            flow.reproduz();
        }

        System.out.println(SaudadeDeRosa.getTitulo() + " tem um total de " + SaudadeDeRosa.getCurtidas() + " Curtidas");
        System.out.println(SaudadeDeRosa.getTitulo() + " tem um total de " + SaudadeDeRosa.getTotalDeReproducao() + " reprocu" +
                "çãoes");
        System.out.println(flow.getTitulo() + " tem um total de " + flow.getCurtidas() + " Curtidas");
        System.out.println(flow.getTitulo() + " tem um total de " + flow.getTotalDeReproducao() + " reprocuçãoes");

        preferida.inclui(SaudadeDeRosa);
        preferida.inclui(flow);


    }
}
