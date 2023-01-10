package padroescomportamentais.strategy;

import java.util.ArrayList;

public class AcaoAdicionar implements Acao {



    public ArrayList<String> modificar(ArrayList<String> lista, String item) {
        lista.add(item);
        return lista;
    }
}
