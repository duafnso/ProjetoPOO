// Jose Eduardo Afonso Capellotto França - 2151324
import java.util.ArrayList;
import java.util.List;

public class PlataformaStreaming {
    private List<Filme> filmes;
    private List<Serie> series;

    public PlataformaStreaming() {
        filmes = new ArrayList<>();
        series = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void adicionarSerie(Serie serie) {
        series.add(serie);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<Serie> getSeries() {
        return series;
    }
}