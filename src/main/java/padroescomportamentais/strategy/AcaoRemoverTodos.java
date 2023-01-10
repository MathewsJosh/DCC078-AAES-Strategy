package padroescomportamentais.strategy;

import java.util.ArrayList;

public class AcaoRemoverTodos implements Acao {
    public ArrayList<String> modificar(ArrayList<String> lista, String item) {
        lista.clear();
        return lista;
    }
}
