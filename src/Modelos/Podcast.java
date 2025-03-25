package Modelos;

public class Podcast extends Audio {
    private String hostDoPodcast;
    private String descricao;

    public String getHostDoPodcast() {
        return hostDoPodcast;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setHostDoPodcast(String hostDoPodcast) {
        this.hostDoPodcast = hostDoPodcast;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas()>500){
            return 10;
        }
            return 8;
    }
}
