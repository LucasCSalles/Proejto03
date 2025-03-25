package Modelos;

public class Audio {
    private int totalDeReproducoes;
    private String titulo;
    private int totalCurtidas;
    private int classificacao;

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtidas(){
        this.totalCurtidas++;
    }
    public void reproducoes(){
        this.totalDeReproducoes++;
    }

}

