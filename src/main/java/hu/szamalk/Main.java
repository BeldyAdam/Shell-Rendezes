package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        int[] lista = {17, 22, 75, 84, 95};
        Rendezes rendezes = new Rendezes(lista);
        rendezes.rendez();
        rendezes.kiirRendezettLista();
    }
}