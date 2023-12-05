package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> listaCasuale = generaListaCasuale(n);

        System.out.println("Lista Casuale: " + listaCasuale);

        List<Integer> listaDoppia = duplicaLista(listaCasuale);

        System.out.println("Lista Doppia: " + listaDoppia);

        boolean booleano = true;
        stampaPosizioni(listaDoppia, booleano);
    }

    private static List<Integer> generaListaCasuale(int N) {
        List<Integer> listaCasuale = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            listaCasuale.add(random.nextInt(101));
        }
        Collections.sort(listaCasuale);

        return listaCasuale;
    }

    private static List<Integer> duplicaLista(List<Integer> lista) {
        List<Integer> listaDoppia = new ArrayList<>(lista);
        Collections.reverse(listaDoppia);

        listaDoppia.addAll(lista);

        return listaDoppia;
    }

    private static void stampaPosizioni(List<Integer> lista, boolean booleano) {
        System.out.println("Valori nelle posizioni " + (booleano ? "pari" : "dispari") + ": ");

        for (int i = (booleano ? 0 : 1); i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }
}
