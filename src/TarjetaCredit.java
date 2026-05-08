package banc.model.producte;

import java.util.Date;

/**
 * Representa una targeta de crèdit associada a un compte corrent.
 * Emmagatzema les dades identificatives i de caducitat de la targeta.
 *
 * <p>Relació: agregació amb {@link banc.model.CompteCorrent}.
 * La targeta pot existir independentment del compte.</p>
 *
 * @author Alumne
 * @version 1.0
 */
public class TarjetaCredit {

    /** Tipus de targeta (p. ex. "Visa", "MasterCard", "AmEx"). */
    private String tipus;

    /** Número de la targeta (format estàndard de 16 dígits). */
    private String numero;

    /** Nom del titular de la targeta. */
    private String titular;

    /** Data de caducitat de la targeta. */
    private Date dataCaducitat;

    /**
     * Constructor de la TarjetaCredit.
     *
     * @param tipus          Tipus de targeta (Visa, MasterCard, etc.)
     * @param numero         Número de targeta
     * @param titular        Nom del titular
     * @param dataCaducitat  Data de caducitat
     */
    public TarjetaCredit(String tipus, String numero, String titular, Date dataCaducitat) {
        this.tipus = tipus;
        this.numero = numero;
        this.titular = titular;
        this.dataCaducitat = dataCaducitat;
    }

    /**
     * Retorna el tipus de targeta.
     *
     * @return tipus (Visa, MasterCard, etc.)
     */
    public String getTipus() { return tipus; }

    /**
     * Retorna el número de la targeta.
     *
     * @return número de 16 dígits
     */
    public String getNumero() { return numero; }

    /**
     * Retorna el nom del titular de la targeta.
     *
     * @return nom del titular
     */
    public String getTitular() { return titular; }

    /**
     * Retorna la data de caducitat.
     *
     * @return data de caducitat
     */
    public Date getDataCaducitat() { return dataCaducitat; }

    /**
     * Comprova si la targeta és vigent (no ha caducat).
     *
     * @return {@code true} si la data de caducitat és posterior a avui
     */
    public boolean isVigent() {
        return dataCaducitat != null && dataCaducitat.after(new Date());
    }

    @Override
    public String toString() {
        return "TarjetaCredit{tipus='" + tipus + "', numero='" + numero + "', titular='" + titular + "'}";
    }
}
