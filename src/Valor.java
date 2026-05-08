package banc.model.producte;

/**
 * Representa un valor borsari (acció, bono, ETF, etc.)
 * dins d'una {@link CarteraDeValors}.
 *
 * <p>Relació de composició: un {@code Valor} no pot existir
 * sense la seva {@link CarteraDeValors} contenidora.</p>
 *
 * @author Alumne
 * @version 1.0
 * @see CarteraDeValors
 */
public class Valor {

    /** Nom o codi del valor borsari (p. ex. "BBVA", "Telefónica"). */
    private String nom;

    /** Nombre de títols (accions) en cartera. */
    private int numTitols;

    /** Preu de cotització actual per títol, en euros. */
    private double preuCotitzacio;

    /**
     * Constructor del Valor.
     *
     * @param nom             Nom o codi del valor
     * @param numTitols       Nombre de títols
     * @param preuCotitzacio  Preu de cotització per títol
     */
    public Valor(String nom, int numTitols, double preuCotitzacio) {
        this.nom = nom;
        this.numTitols = numTitols;
        this.preuCotitzacio = preuCotitzacio;
    }

    /** @return nom del valor */
    public String getNom() { return nom; }

    /** @return nombre de títols en cartera */
    public int getNumTitols() { return numTitols; }

    /**
     * Estableix el nombre de títols.
     *
     * @param numTitols nou nombre de títols (≥ 0)
     */
    public void setNumTitols(int numTitols) {
        if (numTitols >= 0) this.numTitols = numTitols;
    }

    /** @return preu de cotització per títol */
    public double getPreuCotitzacio() { return preuCotitzacio; }

    /**
     * Actualitza el preu de cotització.
     *
     * @param preuCotitzacio nou preu de mercat
     */
    public void setPreuCotitzacio(double preuCotitzacio) {
        if (preuCotitzacio >= 0) this.preuCotitzacio = preuCotitzacio;
    }

    /**
     * Calcula el valor total de la posició (títols × preu).
     *
     * @return valor total en euros
     */
    public double getValorTotal() {
        return numTitols * preuCotitzacio;
    }

    @Override
    public String toString() {
        return "Valor{nom='" + nom + "', titols=" + numTitols + ", preu=" + preuCotitzacio + "}";
    }
}
