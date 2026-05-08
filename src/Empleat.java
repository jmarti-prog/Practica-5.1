package banc.model;

/**
 * Representa un empleat del banc. Hereta de {@link Persona} i
 * està associat a una {@link Sucursal} on treballa.
 *
 * <p>Relació: un empleat treballa a exactament una sucursal (associació 0..* → 1).</p>
 *
 * @author Alumne
 * @version 1.0
 * @see Persona
 * @see Sucursal
 */
public class Empleat extends Persona {

    /** Sucursal on treballa l'empleat. */
    private Sucursal sucursal;

    /**
     * Constructor de l'Empleat.
     *
     * @param dni      Document Nacional d'Identitat
     * @param nom      Nom complet
     * @param adreca   Adreça postal
     * @param telefon  Número de telèfon
     * @param sucursal Sucursal on treballa l'empleat
     */
    public Empleat(String dni, String nom, String adreca, String telefon, Sucursal sucursal) {
        super(dni, nom, adreca, telefon);
        this.sucursal = sucursal;
    }

    /**
     * Retorna la sucursal on treballa l'empleat.
     *
     * @return {@link Sucursal} de l'empleat
     */
    public Sucursal getSucursal() { return sucursal; }

    /**
     * Assigna l'empleat a una nova sucursal.
     *
     * @param sucursal la nova sucursal; no pot ser null
     */
    public void setSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            this.sucursal = sucursal;
        }
    }

    @Override
    public String toString() {
        return "Empleat{dni='" + getDni() + "', nom='" + getNom() +
               "', sucursal=" + (sucursal != null ? sucursal.getId() : "cap") + "}";
    }
}
