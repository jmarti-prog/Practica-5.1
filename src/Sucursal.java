package banc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una sucursal bancària. Cada sucursal té un identificador
 * únic i una adreça, i gestiona els seus empleats.
 *
 * @author Alumne
 * @version 1.0
 * @see Empleat
 */
public class Sucursal {

    /** Identificador únic de la sucursal. */
    private String id;

    /** Adreça física de la sucursal. */
    private String adreca;

    /** Llista d'empleats que treballen a la sucursal. */
    private List<Empleat> empleats;

    /**
     * Constructor de la Sucursal.
     *
     * @param id     Identificador únic de la sucursal
     * @param adreca Adreça de la sucursal
     */
    public Sucursal(String id, String adreca) {
        this.id = id;
        this.adreca = adreca;
        this.empleats = new ArrayList<>();
    }

    /**
     * Retorna l'identificador de la sucursal.
     *
     * @return id de la sucursal
     */
    public String getId() { return id; }

    /**
     * Retorna l'adreça de la sucursal.
     *
     * @return adreça postal
     */
    public String getAdreca() { return adreca; }

    /**
     * Estableix l'adreça de la sucursal.
     *
     * @param adreca nova adreça
     */
    public void setAdreca(String adreca) { this.adreca = adreca; }

    /**
     * Retorna la llista d'empleats de la sucursal.
     *
     * @return llista d'{@link Empleat}
     */
    public List<Empleat> getEmpleats() { return empleats; }

    /**
     * Afegeix un empleat a la sucursal.
     *
     * @param empleat l'empleat a afegir
     */
    public void addEmpleat(Empleat empleat) {
        if (empleat != null && !empleats.contains(empleat)) {
            empleats.add(empleat);
        }
    }

    @Override
    public String toString() {
        return "Sucursal{id='" + id + "', adreca='" + adreca + "'}";
    }
}
