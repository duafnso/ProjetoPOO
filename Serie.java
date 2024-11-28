// Jose Eduardo Afonso Capellotto França - 2151324
public class Serie {
    private String titulo;
    private String genero;
    private int temporadas;

    public Serie(String titulo, String genero, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public String toString() {
        return "Série: " + titulo + " | Gênero: " + genero + " | Temporadas: " + temporadas;
    }
}