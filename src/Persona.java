package banc.model;

/**
 * Classe abstracta que representa una persona (client o empleat) del banc.
 * Conté la informació personal bàsica compartida per tots dos tipus.
 *
 * @author Alumne
 * @version 1.0
 */
public abstract class Persona {

    /** Document Nacional d'Identitat de la persona. */
    private String dni;

    /** Nom complet de la persona. */
    private String nom;

    /** Adreça postal de la persona. */
    private String adreca;

    /** Número de telèfon de contacte. */
    private String telefon;

    /**
     * Constructor de la classe Persona.
     *
     * @param dni     Document Nacional d'Identitat
     * @param nom     Nom complet
     * @param adreca  Adreça postal
     * @param telefon Número de telèfon
     */
    public Persona(String dni, String nom, String adreca, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
    }

    /**
     * Retorna el DNI de la persona.
     *
     * @return DNI de la persona
     */
    public String getDni() { return dni; }

    /**
     * Estableix el DNI de la persona.
     *
     * @param dni nou DNI
     */
    public void setDni(String dni) { this.dni = dni; }

    /**
     * Retorna el nom de la persona.
     *
     * @return nom complet
     */
    public String getNom() { return nom; }

    /**
     * Estableix el nom de la persona.
     *
     * @param nom nou nom complet
     */
    public void setNom(String nom) { this.nom = nom; }

    /**
     * Retorna l'adreça de la persona.
     *
     * @return adreça postal
     */
    public String getAdreca() { return adreca; }

    /**
     * Estableix l'adreça de la persona.
     *
     * @param adreca nova adreça
     */
    public void setAdreca(String adreca) { this.adreca = adreca; }

    /**
     * Retorna el telèfon de la persona.
     *
     * @return número de telèfon
     */
    public String getTelefon() { return telefon; }

    /**
     * Estableix el telèfon de la persona.
     *
     * @param telefon nou número de telèfon
     */
    public void setTelefon(String telefon) { this.telefon = telefon; }

    /**
     * Retorna una representació textual de la persona.
     *
     * @return String amb les dades de la persona
     */
    @Override
    public String toString() {
        return "Persona{dni='" + dni + "', nom='" + nom + "', adreca='" + adreca + "', telefon='" + telefon + "'}";
    }
}
