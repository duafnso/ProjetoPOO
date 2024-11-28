// Jose Eduardo Afonso Capellotto França - 2151324
import java.util.ArrayList;
import java.util.List;

public class ListaDeAssistidos {
    private List<Object> assistidos; 

    public ListaDeAssistidos() {
        assistidos = new ArrayList<>();
    }

    public void adicionarAssistido(Object assistido) {
        assistidos.add(assistido);
    }

    public List<Object> getAssistidos() {
        return assistidos;
    }
}