public class Salarie extends Personne {
    private double salaire;
    private int absInjust;
    private int absJust;
    private double nbHeure;
    
    
    /**
     * Attribut de la classe avec les Constructeur
     * 
     * @param nom
     * @param prenom
     * @param age
     * @param salaire
     * @param absInjust
     * @param absJust
     * @param nbHeure
     */
    public Salarie(String nom, String prenom, int age, double salaire, int absInjust, int absJust, double nbHeure) {
        super(nom, prenom, age);
        this.salaire = salaire;
        this.absInjust = absInjust;
        this.absJust = absJust;
        this.nbHeure = nbHeure;
        
    }
    /**
     * @return
     * Retourne le Salaire
     */
    public double getSalaire() {
        return salaire;
    }
    /**
     * @param salaire
     * Initialisation de ce paramètre
     */
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    /**
     * @return
     * Retoune les Absences Injustifiées
     */
    public int getabsInjust() {
        return absInjust;
    }
    /**
     * @param absInjust
     * Initialisation de ce paramètre
     */
    public void setabsInjust(int absInjust) {
        this.absInjust = absInjust;
    }
    /**
     * @return
     * Retourne Les Absences Justifiées
     */
    public int getAbsJust() {
        return absJust;
    }
    /**
     * @param absJust
     * Initialisation de ce paramètre
     */
    public void setAbsJust(int absJust) {
        this.absJust = absJust;
    }
    /**
     * @return
     * Retourne le nombre d'heure
     */
    public double getNbHeure() {
        return nbHeure;
    }
    /**
     * @param nbHeure
     * Initialisation de ce paramètre
     */
    public void setNbHeure(double nbHeure) {
        this.nbHeure = nbHeure;
    }
    /* (non-Javadoc)
     * @see Personne#toString()
     * 
     * Adapter l'affichage des attributs de la classe
     */
    @Override
    public String toString() {
        return super.toString()+" salaire=" + salaire + ", absInjust=" + absInjust + ", absJust=" + absJust ;
    }
    
}
