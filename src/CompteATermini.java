package banc.model;

import java.util.Date;

/**
 * Representa un compte bancari a termini fix.
 * Hereta de {@link Compte} i afegeix el nombre de mesos
 * que romandrà bloquejat el dipòsit.
 *
 * <p>A diferència del {@link CompteCorrent}, aquest compte
 * <strong>no pot tenir productes associats</strong> (targetes, fons, carteres).</p>
 *
 * @author Alumne
 * @version 1.0
 * @see Compte
 */
public class CompteATermini extends Compte {

    /** Nombre de mesos que estarà oberta (bloquejada) la imposició. */
    private int numMesos;

    /**
     * Constructor del CompteATermini.
     *
     * @param numCompte    Número identificatiu del compte
     * @param dataObertura Data d'obertura
     * @param saldo        Saldo inicial (import del dipòsit)
     * @param tipusInteres Tipus d'interès anual (%)
     * @param numMesos     Nombre de mesos de durada del termini
     */
    public CompteATermini(String numCompte, Date dataObertura,
                          double saldo, double tipusInteres, int numMesos) {
        super(numCompte, dataObertura, saldo, tipusInteres);
        this.numMesos = numMesos;
    }

    /**
     * Retorna el nombre de mesos del termini.
     *
     * @return nombre de mesos
     */
    public int getNumMesos() { return numMesos; }

    /**
     * Estableix el nombre de mesos del termini.
     *
     * @param numMesos nou nombre de mesos (ha de ser positiu)
     */
    public void setNumMesos(int numMesos) {
        if (numMesos > 0) this.numMesos = numMesos;
    }

    /**
     * Calcula els interessos generats al venciment del termini.
     *
     * @return import dels interessos en euros
     */
    public double calcularInteressos() {
        return getSaldo() * (getTipusInteres() / 100) * (numMesos / 12.0);
    }

    @Override
    public String toString() {
        return "CompteATermini{num='" + getNumCompte() + "', saldo=" + getSaldo() +
               ", mesos=" + numMesos + "}";
    }
}
