// Jose Eduardo Afonso Capellotto França - 2151324
import java.util.ArrayList;
import java.util.List;

public class Recomendacao {
    private PlataformaStreaming plataforma;

    public Recomendacao(PlataformaStreaming plataforma) {
        this.plataforma = plataforma;
    }

    public List<Object> recomendar() {
        List<Object> recomendacoes = new ArrayList<>();
        List<Filme> filmes = plataforma.getFilmes();
        List<Serie> series = plataforma.getSeries();

        
        if (!filmes.isEmpty()) {
            recomendacoes.addAll(filmes.subList(0, Math.min(3, filmes.size())));
        }
        if (!series.isEmpty()) {
            recomendacoes.addAll(series.subList(0, Math.min(3, series.size())));
        }

        return recomendacoes;
    }
}