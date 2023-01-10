package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveAdicionarItem() {
        Professor professor = new Professor();
        professor.addItem("a");
        List<String> response = Arrays.asList("a");
        assertEquals(response, professor.getLista());
    }

    @Test
    void deveDuplicarItem() {
        Professor professor = new Professor();
        professor.duplicarItem("b");
        List<String> response = Arrays.asList("b", "b");
        assertEquals(response, professor.getLista());
    }

    @Test
    void deveRemoverItem() {
        Professor professor = new Professor();
        professor.addItem("a");
        professor.duplicarItem("b");
        professor.removerItem("a");
        List<String> response = Arrays.asList("b", "b");
        assertEquals(response, professor.getLista());
    }

    @Test
    void deveRetornarErroAoRemover(){
        Professor professor = new Professor();
        professor.addItem("a");
        professor.duplicarItem("b");
        professor.removerItem("c");
        List<String> response = Arrays.asList("a", "b", "b");
        assertEquals(response, professor.getLista());
    }

    @Test
    void deveLimparLista() {
        Professor professor = new Professor();
        professor.duplicarItem("a");
        professor.addItem("c");
        professor.duplicarItem("e");
        professor.removerTodos("");
        ArrayList<String> response = new ArrayList();
        assertEquals(response, professor.getLista());
    }


}