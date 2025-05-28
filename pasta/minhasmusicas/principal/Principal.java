package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        Musica minhamMusica = new Musica();
        minhamMusica.setTitulo("Forever");
        minhamMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhamMusica.reproduz(); 
        }

        for (int i = 0; i < 50; i++) {
            minhamMusica.curte();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 2000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhamMusica);

    }




}
