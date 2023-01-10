package padroescomportamentais.strategy;

import java.util.ArrayList;

public class Professor {

    ArrayList<String> lista = new ArrayList();

    public ArrayList<String> getLista() {
        return lista;
    }

    public void addItem(String item) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas(lista, item);
        this.lista = listaDeTarefas.modificar(new AcaoAdicionar());
    }

    public void duplicarItem(String item) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas(lista, item);
        this.lista = listaDeTarefas.modificar(new AcaoDuplicar());
    }

    public void removerItem(String item) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas(lista, item);
        this.lista = listaDeTarefas.modificar(new AcaoRemover());
    }

    public void removerTodos(String item) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas(lista, item);
        this.lista = listaDeTarefas.modificar(new AcaoRemoverTodos());
    }



}
