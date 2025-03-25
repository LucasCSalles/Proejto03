package Principal;

import Modelos.MinhasCurtidas;
import Modelos.Musica;
import Modelos.Podcast;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("JetLag");
        musica.setArtista("Chaoss");
        musica.setGenero("Hip-Hop/Rap");

        for (int i = 0; i < 1000; i++) {
            musica.reproducoes();
        }
        for (int i = 0; i < 80; i++) {
            musica.curtidas();
        }
    //Nao escuto podcasts ainda hahahah
        Podcast podcast = new Podcast();
        podcast.setTitulo("Bolha dev");
        podcast.setHostDoPodcast("Marcus Mendes");

        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(400,1000) ; i++) {
            podcast.reproducoes();
        }
        for (int i = 0; i < rd.nextInt(10,80) ; i++) {
            podcast.curtidas();
        }
        MinhasCurtidas curtidas = new MinhasCurtidas();
        curtidas.incluido(podcast);
        curtidas.incluido(musica);
    }
}
