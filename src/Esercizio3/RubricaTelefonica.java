package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String numeroTelefono) {
        rubrica.put(nome, numeroTelefono);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaPersonaPerNumero(String numeroTelefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numeroTelefono)) {
                return entry.getKey(); // Restituisce il nome della persona
            }
        }
        return null;
    }

    public String cercaNumeroPerNome(String nome) {
        return rubrica.get(nome);
    }

    public void stampaContatti() {
        Set<Map.Entry<String, String>> entries = rubrica.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }
}
