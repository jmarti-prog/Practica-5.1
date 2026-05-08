package banc.model;

import banc.model.producte.CarteraDeValors;
import banc.model.producte.FonsInversio;
import banc.model.producte.TarjetaCredit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa un compte corrent bancari.
 * Hereta de {@link Compte} i pot tenir targetes de crèdit,
 * fons d'inversió i carteres de valors associats.
 *
 * <p>Relacions:
 * <ul>
 *   <li>Agregació amb {@link TarjetaCredit} (0..*)</li>
 *   <li>Associació amb {@link FonsInversio} (0..*)</li>
 *   <li>Associació amb {@link CarteraDeValors} (0..*)</li>
 * </ul>
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Compte
 * @see TarjetaCredit
 * @see FonsInversio
 * @see CarteraDeValors
 */
public class CompteCorrent extends Compte {

    /** Targetes de crèdit associades al compte corrent (agregació). */
    private List<TarjetaCredit> tarjetes;

    /** Fons d'inversió associats (el compte corrent és el contenidor). */
    private List<FonsInversio> fonsInversio;

    /** Carteres de valors associades al compte corrent. */
    private List<CarteraDeValors> carteres;

    /**
     * Constructor del CompteCorrent.
     *
     * @param numCompte    Número identificatiu del compte
     * @param dataObertura Data d'obertura
     * @param saldo        Saldo inicial
     * @param tipusInteres Tipus d'interès anual (%)
     */
    public CompteCorrent(String numCompte, Date dataObertura, double saldo, double tipusInteres) {
        super(numCompte, dataObertura, saldo, tipusInteres);
        this.tarjetes = new ArrayList<>();
        this.fonsInversio = new ArrayList<>();
        this.carteres = new ArrayList<>();
    }

    /**
     * Retorna les targetes de crèdit del compte.
     *
     * @return llista de {@link TarjetaCredit}
     */
    public List<TarjetaCredit> getTarjetes() { return tarjetes; }

    /**
     * Afegeix una targeta de crèdit al compte corrent.
     * Relació d'agregació: la targeta pot existir independentment.
     *
     * @param tarjeta la targeta a associar; no pot ser null
     */
    public void addTarjeta(TarjetaCredit tarjeta) {
        if (tarjeta != null && !tarjetes.contains(tarjeta)) {
            tarjetes.add(tarjeta);
        }
    }

    /**
     * Elimina una targeta del compte corrent.
     *
     * @param tarjeta la targeta a eliminar
     * @return {@code true} si s'ha eliminat
     */
    public boolean removeTarjeta(TarjetaCredit tarjeta) {
        return tarjetes.remove(tarjeta);
    }

    /**
     * Retorna els fons d'inversió associats.
     *
     * @return llista de {@link FonsInversio}
     */
    public List<FonsInversio> getFonsInversio() { return fonsInversio; }

    /**
     * Afegeix un fons d'inversió associat al compte corrent.
     *
     * @param fons el fons d'inversió a afegir
     */
    public void addFonsInversio(FonsInversio fons) {
        if (fons != null && !fonsInversio.contains(fons)) {
            fonsInversio.add(fons);
        }
    }

    /**
     * Retorna les carteres de valors associades.
     *
     * @return llista de {@link CarteraDeValors}
     */
    public List<CarteraDeValors> getCarteres() { return carteres; }

    /**
     * Afegeix una cartera de valors al compte corrent.
     *
     * @param cartera la cartera a afegir
     */
    public void addCartera(CarteraDeValors cartera) {
        if (cartera != null && !carteres.contains(cartera)) {
            carteres.add(cartera);
        }
    }

    @Override
    public String toString() {
        return "CompteCorrent{num='" + getNumCompte() + "', saldo=" + getSaldo() +
               ", tarjetes=" + tarjetes.size() + "}";
    }
}
