package hu.szamalk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RendezesTest {

    public boolean eldontesTetel(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    void testRendezes() {
        int[] lista = {5, 3, 8, 4, 2};
        Rendezes rendezes = new Rendezes(lista);
        rendezes.rendez();

        assertTrue(eldontesTetel(lista));
    }

    @Test
    void testRendezesUresTomb() {
        int[] lista = {};
        Rendezes rendezes = new Rendezes(lista);
        rendezes.rendez();

        assertTrue(eldontesTetel(lista));
    }
}