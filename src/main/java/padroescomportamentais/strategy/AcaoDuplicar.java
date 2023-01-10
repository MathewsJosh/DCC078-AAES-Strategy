package padroescomportamentais.strategy;

import java.util.ArrayList;

public class AcaoDuplicar implements Acao {

    public ArrayList<String> modificar(ArrayList<String> lista, String item) {
        lista.add(item);
        lista.add(item);
        return lista;
    }
}
