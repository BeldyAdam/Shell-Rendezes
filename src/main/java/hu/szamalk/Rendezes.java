package hu.szamalk;

public class Rendezes {
    private int[] lista;

    public Rendezes(int[] lista) {
        this.lista = lista;
    }

    public void rendez() {
        int n = lista.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = lista[i];
                int j = i;

                while (j >= gap && lista[j - gap] > temp) {
                    lista[j] = lista[j - gap];
                    j -= gap;
                }
                lista[j] = temp;
            }
            gap /= 2;
        }
    }
    public void kiirRendezettLista() {
        for (int i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}