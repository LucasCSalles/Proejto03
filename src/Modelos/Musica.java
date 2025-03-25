package Modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducoes()>999){
            return 10;
        }
        return 8;
    }
}

