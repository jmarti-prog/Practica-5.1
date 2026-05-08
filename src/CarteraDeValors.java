package banc.model.producte;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una cartera de valors borsaris associada a un compte corrent.
 * Agrupa múltiples {@link Valor} i en gestiona el conjunt.
 *
 * <p>Relació de composició amb {@link Valor}: els valors formen part
 * intrínseca de la cartera i no existeixen fora d'ella.</p>
 *
 * @author Alumne
 * @version 1.0
 * @see Valor
 */
public class CarteraDeValors {

    /** Llista de valors borsaris que componen la cartera (composició). */
    private List<Valor> valors;

    /**
     * Constructor de la CarteraDeValors. Inicia amb cartera buida.
     */
    public CarteraDeValors() {
        this.valors = new ArrayList<>();
    }

    /**
     * Retorna la llista de valors de la cartera.
     *
     * @return llista de {@link Valor}
     */
    public List<Valor> getValors() { return valors; }

    /**
     * Afegeix un valor a la cartera.
     * Si el valor és null, no s'afegeix.
     *
     * @param valor el valor a afegir
     */
    public void addValor(Valor valor) {
        if (valor != null) {
            valors.add(valor);
        }
    }

    /**
     * Elimina un valor de la cartera.
     *
     * @param valor el valor a eliminar
     * @return {@code true} si s'ha eliminat correctament
     */
    public boolean removeValor(Valor valor) {
        return valors.remove(valor);
    }

    /**
     * Calcula el valor total de mercat de tota la cartera.
     *
     * @return suma del valor de tots els valors en euros
     */
    public double getValorTotal() {
        return valors.stream()
                     .mapToDouble(Valor::getValorTotal)
                     .sum();
    }

    /**
     * Retorna el nombre de valors diferents a la cartera.
     *
     * @return nombre de posicions
     */
    public int getNombreValors() {
        return valors.size();
    }

    @Override
    public String toString() {
        return "CarteraDeValors{posicions=" + valors.size() + ", valorTotal=" + getValorTotal() + " €}";
    }
}
