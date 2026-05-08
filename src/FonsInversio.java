package banc.model.producte;

import java.util.Date;

/**
 * Representa un fons d'inversió associat a un compte corrent.
 * Emmagatzema la informació econòmica i temporal del fons.
 *
 * @author Alumne
 * @version 1.0
 */
public class FonsInversio {

    /** Nom comercial del fons d'inversió. */
    private String nom;

    /** Import invertit en euros. */
    private double importInicial;

    /** Rendibilitat esperada o aconseguida (en percentatge anual). */
    private double rendibilitat;

    /** Data d'obertura o subscripció del fons. */
    private Date dataObertura;

    /** Data de venciment del fons. */
    private Date dataVenciment;

    /**
     * Constructor del FonsInversio.
     *
     * @param nom           Nom del fons
     * @param importInicial Import invertit
     * @param rendibilitat  Rendibilitat anual (%)
     * @param dataObertura  Data d'inici
     * @param dataVenciment Data de venciment
     */
    public FonsInversio(String nom, double importInicial, double rendibilitat,
                        Date dataObertura, Date dataVenciment) {
        this.nom = nom;
        this.importInicial = importInicial;
        this.rendibilitat = rendibilitat;
        this.dataObertura = dataObertura;
        this.dataVenciment = dataVenciment;
    }

    /** @return nom del fons */
    public String getNom() { return nom; }

    /** @return import inicial invertit */
    public double getImportInicial() { return importInicial; }

    /** @return rendibilitat anual en % */
    public double getRendibilitat() { return rendibilitat; }

    /** @return data d'obertura */
    public Date getDataObertura() { return dataObertura; }

    /** @return data de venciment */
    public Date getDataVenciment() { return dataVenciment; }

    /**
     * Indica si el fons és encara actiu (no ha vençut).
     *
     * @return {@code true} si la data de venciment és futura
     */
    public boolean isActiu() {
        return dataVenciment != null && dataVenciment.after(new Date());
    }

    /**
     * Calcula el valor esperat del fons al venciment.
     *
     * @return import total esperat en euros
     */
    public double calcularValorEsperat() {
        long dies = (dataVenciment.getTime() - dataObertura.getTime()) / (1000L * 60 * 60 * 24);
        double anys = dies / 365.0;
        return importInicial * (1 + rendibilitat / 100) * anys;
    }

    @Override
    public String toString() {
        return "FonsInversio{nom='" + nom + "', import=" + importInicial + ", rendibilitat=" + rendibilitat + "%}";
    }
}
