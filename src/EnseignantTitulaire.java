// Classe EnseignantTitulaire qui hérite de la classe Salarie
public class EnseignantTitulaire extends Salarie {
    private double tauxSalaireT;
    private double heursup;

    public EnseignantTitulaire(String nom, String prenom, int age, double salaire, int absInjust, int absJust,
            double nbHeure, double tauxSalaireT) {
        super(nom, prenom, age, salaire, absInjust, absJust, nbHeure);
        this.tauxSalaireT = tauxSalaireT;
    }
   
    
    /**
     * Retourne le salaire en multipliant le taux et le nombre d'heure
     * @return
     */
    public double calculeSalaireInitiale(){ 
        if(getNbHeure()>=4. && getNbHeure()<= 384.)
        setSalaire(getTauxSalaire()*getNbHeure());
        return getSalaire();
    }
    
    /**
     * Permet de gérer les heures supplémentaires et les heures manquées
     * @param heursup
     * @param heurmoin
     */
    public void calculeSalaireHeureSupT(double heursup,double heurmoin ){ 
        if((heursup>=0) &&(heurmoin==0)&& (getNbHeure()>=4. && getNbHeure()<= 384.)  ){
        setNbHeure(getNbHeure()+heursup);
        }else if(heurmoin>=0 &&(heursup==0) && (getNbHeure()>=4. && getNbHeure()<= 384.) ){
            setNbHeure(getNbHeure()-heurmoin);
        }
    }

    /**
     * Retourne le Taux du Salaire
     * @return
     */
    public double getTauxSalaireT() {
        return tauxSalaireT;
    }

    /**
     * Initialisation de ce paramètre
     * @param tauxSalaireT
     */
    public void setTauxSalaireT(double tauxSalaireT) {
        this.tauxSalaireT = tauxSalaireT;
    }

    /**
     * Retourne les Heures Supplémentaires
     * @return
     */
    public double getHeursup() {
        return heursup;
    }
 
    /**
     * Constructeur
     * @param heursupAdd
     */
    public void setHeursup(double heursupAdd) {
        if(heursup>=192.)
        this.heursup = heursup +heursupAdd;
    }
}
