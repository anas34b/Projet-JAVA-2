// Classe EnseignantTitulaire qui hérite de la classe Salarie
public class EnseignantVacataire extends Salarie {
    
    
    /**
     * @param nom
     * @param prenom
     * @param age
     * @param salaire
     * @param absInjust
     * @param absJust
     * @param nbHeure
     */
    public EnseignantVacataire(String nom, String prenom, int age, double salaire, int absInjust, int absJust,
            double nbHeure) {
        super(nom, prenom, age, salaire, absInjust, absJust, nbHeure);
    }
    public double calculeSalaireInitiale(){
        setSalaire(getTauxSalaire()*getNbHeure());
        return getSalaire();
    }
    
    /**
     * Retourne le salaire avec prise en compte des absences injustifiées
     * @return
     */
    public double calculeSalaireAbsInjust(){ 
        setNbHeure(getNbHeure() - getabsInjust());
        calculeSalaireInitiale();
        return getSalaire();
    }
    
    /**
     * Permet de gérer les heures supplémentaires et les heures manquées
     * @param heursup
     * @param heurmoin
     */
    public void calculeSalaireHeureSup(double heursup,double heurmoin ){ 
        if((heursup>=0) &&(heurmoin==0)  ){
        setNbHeure(getNbHeure()+heursup);
        }else if(heurmoin>=0 &&(heursup==0) ){
            setNbHeure(getNbHeure()-heurmoin);
        }
    }

}
