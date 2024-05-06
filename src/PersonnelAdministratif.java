public class PersonnelAdministratif extends Salarie {
    private double primeAnnuelle;
    
    
    /**
     * Attribut de la classe
     * @param nom
     * @param prenom
     * @param age
     * @param salaire
     * @param absInjust
     * @param absJust
     * @param nbHeure
     * @param primeAnnuelle
     */
    public PersonnelAdministratif(String nom, String prenom, int age, double salaire, int absInjust, int absJust,
            double nbHeure, double primeAnnuelle) {
        super(nom, prenom, age, salaire, absInjust, absJust, nbHeure);
        this.primeAnnuelle = primeAnnuelle;
    }
    /* (non-Javadoc)
     * @see Salarie#toString()
     * Adapter l'affichage des attributs de la classe
     */
    @Override
    public String toString(){
        return super.toString()+" primeAnnuelle=" + primeAnnuelle + "]";
    }
    /**
     * @return
     * Retourne le salaire en multipliant le taux et le nombre d'heure
     */
    public double calculeSalaireInitiale(){
        setSalaire(getTauxSalaire()*getNbHeure());
        return getSalaire();
    }
    /**
     * @return
     * Retourne le salaire en ajoutant la prime Annuelle
     */
    public double calculeSalairePrime(){
        setSalaire(getSalaire()+primeAnnuelle);
        return getSalaire();
    }
    /**
     * @return
     * Retourne salaire avec prise en compte des absences injustifiées
     */
    public double calculeSalaireAbsInjust(){
        setNbHeure(getNbHeure() - getabsInjust());
        calculeSalaireInitiale();
        return getSalaire();
    }
}
