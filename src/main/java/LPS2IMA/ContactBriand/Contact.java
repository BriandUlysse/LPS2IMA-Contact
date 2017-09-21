package LPS2IMA.ContactBriand;

/** */
public class Contact {
    /** */
    private String nom;

    /** a. */
    private String telephone;

    /**
     * Constructeur de contact.
     * @param leNom : le nom.
     * @param leTelephone : le numéro de télehone.
     */
    public Contact(final String leNom, final String leTelephone) {
        this.nom = leNom;
        this.telephone = leTelephone;
    }

    /**
     * a.
     * @return le nom.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * a.
     * @return le numéro de téléphone.
     */
    public String getTelephone() {
        return this.telephone;
    }
}
