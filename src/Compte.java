package banc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe abstracta que representa un compte bancari genèric.
 * Defineix els atributs i comportaments comuns de tots els comptes.
 *
 * <p>Els dos subtipus concrets són {@link CompteCorrent} i {@link CompteATermini}.</p>
 *
 * @author Alumne
 * @version 1.0
 * @see CompteCorrent
 * @see CompteATermini
 * @see Client
 */
public abstract class Compte {

    /** Número de compte bancari (IBAN o similar). */
    private String numCompte;

    /** Data d'obertura del compte. */
    private Date dataObertura;

    /** Saldo actual del compte en euros. */
    private double saldo;

    /** Tipus d'interès anual aplicat al compte (en percentatge). */
    private double tipusInteres;

    /** Llista de titulars (clients) associats al compte. */
    private List<Client> titulars;

    /**
     * Constructor del Compte.
     *
     * @param numCompte    Número identificatiu del compte
     * @param dataObertura Data en què s'obre el compte
     * @param saldo        Saldo inicial
     * @param tipusInteres Tipus d'interès anual (%)
     */
    public Compte(String numCompte, Date dataObertura, double saldo, double tipusInteres) {
        this.numCompte = numCompte;
        this.dataObertura = dataObertura;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
        this.titulars = new ArrayList<>();
    }

    /**
     * Retorna el número de compte.
     *
     * @return número de compte
     */
    public String getNumCompte() { return numCompte; }

    /**
     * Retorna la data d'obertura del compte.
     *
     * @return data d'obertura
     */
    public Date getDataObertura() { return dataObertura; }

    /**
     * Retorna el saldo actual del compte.
     *
     * @return saldo en euros
     */
    public double getSaldo() { return saldo; }

    /**
     * Retorna el tipus d'interès del compte.
     *
     * @return tipus d'interès anual en percentatge
     */
    public double getTipusInteres() { return tipusInteres; }

    /**
     * Estableix el tipus d'interès del compte.
     *
     * @param tipusInteres nou tipus d'interès (%)
     */
    public void setTipusInteres(double tipusInteres) { this.tipusInteres = tipusInteres; }

    /**
     * Retorna la llista de titulars del compte.
     *
     * @return llista de {@link Client}
     */
    public List<Client> getTitulars() { return titulars; }

    /**
     * Afegeix un titular al compte.
     *
     * @param client el client a afegir com a titular
     */
    public void addTitular(Client client) {
        if (client != null && !titulars.contains(client)) {
            titulars.add(client);
        }
    }

    /**
     * Realitza un ingrés al compte.
     *
     * @param quantitat import a ingressar (ha de ser positiu)
     * @throws IllegalArgumentException si la quantitat és negativa o zero
     */
    public void ingressar(double quantitat) {
        if (quantitat <= 0) throw new IllegalArgumentException("La quantitat ha de ser positiva.");
        this.saldo += quantitat;
    }

    /**
     * Realitza una retirada de diners del compte.
     *
     * @param quantitat import a retirar (ha de ser positiu)
     * @return {@code true} si s'ha pogut retirar, {@code false} si no hi ha prou saldo
     */
    public boolean retirar(double quantitat) {
        if (quantitat <= 0) throw new IllegalArgumentException("La quantitat ha de ser positiva.");
        if (saldo >= quantitat) {
            saldo -= quantitat;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Compte{numCompte='" + numCompte + "', saldo=" + saldo + "}";
    }
}
