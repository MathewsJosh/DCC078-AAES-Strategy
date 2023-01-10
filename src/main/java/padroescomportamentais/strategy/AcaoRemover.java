package padroescomportamentais.strategy;

import java.util.ArrayList;

public class AcaoRemover implements Acao {
    public ArrayList<String> modificar(ArrayList<String> lista, String item) {
        try {
            lista.remove(lista.lastIndexOf(item));
            return lista;
        }
        catch(Exception ex) {
            return lista;
        }

    }
}
