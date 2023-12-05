package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole (N): ");
        int numeroElementi = Integer.parseInt(input.nextLine());

        Set<String> paroleSet = new HashSet<>();

        Set<String> paroleDuplicateSet = new HashSet<>();


        for (int i = 0; i < numeroElementi; i++) {
            System.out.println("Inserisci la parola " + (i + 1) + ": ");
            String parola = input.nextLine();

            if (!paroleSet.add(parola)) {
                paroleDuplicateSet.add(parola);
            }
        }
        System.out.println("Parole duplicate: " + paroleDuplicateSet);
        System.out.println("Numero di parole distinte: " + paroleSet.size());
        System.out.println("Elenco delle parole distinte: " + paroleSet);

        input.close();
    }
}
