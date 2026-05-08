package banc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un client del banc. Hereta de {@link Persona} i pot tenir
 * associats diversos comptes bancaris.
 *
 * @author Alumne
 * @version 1.0
 * @see Persona
 * @see Compte
 */
public class Client extends Persona {

    /** Llista de comptes bancaris associats al client. */
    private List<Compte> comptes;

    /**
     * Constructor del Client.
     *
     * @param dni     Document Nacional d'Identitat
     * @param nom     Nom complet
     * @param adreca  Adreça postal
     * @param telefon Número de telèfon
     */
    public Client(String dni, String nom, String adreca, String telefon) {
        super(dni, nom, adreca, telefon);
        this.comptes = new ArrayList<>();
    }

    /**
     * Retorna la llista de comptes del client.
     *
     * @return llista de {@link Compte}
     */
    public List<Compte> getComptes() {
        return comptes;
    }

    /**
     * Afegeix un compte bancari al client.
     * Un client pot ser titular de múltiples comptes.
     *
     * @param compte el compte a afegir; no pot ser null
     */
    public void addCompte(Compte compte) {
        if (compte != null && !comptes.contains(compte)) {
            comptes.add(compte);
        }
    }

    /**
     * Elimina un compte de la llista del client.
     *
     * @param compte el compte a eliminar
     * @return {@code true} si s'ha eliminat correctament
     */
    public boolean removeCompte(Compte compte) {
        return comptes.remove(compte);
    }

    @Override
    public String toString() {
        return "Client{dni='" + getDni() + "', nom='" + getNom() + "', comptes=" + comptes.size() + "}";
    }
}
