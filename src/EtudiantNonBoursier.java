public class EtudiantNonBoursier extends Etudiant {

    /**
     * Attribut de la classe
     * @param nom
     * @param prenom
     * @param age
     * @param absJust
     * @param absInjust
     */
    public EtudiantNonBoursier(String nom, String prenom, int age, int absJust, int absInjust) {
        super(nom, prenom, age, absJust, absInjust);
    }

    /* (non-Javadoc)
     * @see Etudiant#toString()
     * Adapter l'affichage des attributs de la classe
     */
    @Override
    public String toString() {
        return super.toString()+", EtudiantNonBoursier ]";
    }
    /**
     * @return
     * Retourne False s'il a plus de 5 absences sinon True
     */
    private boolean VerifValidationBaseSurAbscence() {
        if(this.absInjust>=5){
            return false;
        }else 
        return true;
    }
    /**
     * Affiche Validation ou non de son année ou remboursement de sa bourse ou non par rapport au absences
     */
    public void affichValidationBaseSurAbscence(){  
        if(this.VerifValidationBaseSurAbscence()){
            System.out.println(this.getNom()+" peut valider son année car ses absences insjutifiés sont inférieur à 5");
        }else{
            System.out.println(this.getNom()+" ne peut pas valider son année car ses absences insjutiféss sont supérieur à 5");
        }
    }
}
