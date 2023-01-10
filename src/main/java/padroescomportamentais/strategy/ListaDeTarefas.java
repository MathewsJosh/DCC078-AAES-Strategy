package padroescomportamentais.strategy;
import java.util.ArrayList;

public class ListaDeTarefas {
    ArrayList<String> lista;
    String item;

    public ListaDeTarefas(ArrayList<String> lista, String item) {
        this.lista = lista;
        this.item = item;
    }

    public ArrayList<String> modificar(Acao acao) {
        return acao.modificar(lista, item);
    }
}
