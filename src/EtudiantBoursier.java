// Classe EtudiantBoursier qui hérite de la classe Etudiant
public class EtudiantBoursier extends Etudiant {

    /**
     * Attribut de la classe
     * @param nom
     * @param prenom
     * @param age
     * @param abs_just
     * @param abs_injust
     */
    public EtudiantBoursier(String nom, String prenom, int age, int abs_just, int abs_injust) {
        super(nom, prenom, age, abs_just, abs_injust);
    }

    /* (non-Javadoc)
     * @see Etudiant#toString()
     * Adapter l'affichage des attributs de la classe
     */
    @Override
    public String toString() {
        return super.toString()+", EtudiantBoursier ]";
    }
    
    /**
     * @return
     * Retourne True s'il a plus de 5 absences sinon False
     */
    private boolean VerifValidationBaseSurAbscence() { 
        if(this.absInjust>=5){
            return false;
        }else 
        return true;
    }

    /**
     * Affiche Validation de son année ou non ou remboursement de sa bourse ou non par rapport au absences
     */
    public void affichValidationBaseSurAbscenceEtRemboursementBourse(){
        if(this.VerifValidationBaseSurAbscence()){
            System.out.println(this.getNom()+" peut valider son année car ses absences insjutifiées sont inférieur à 5");
            System.out.println(this.getNom()+" ne doit pas remboursé sa bourse car il a "+this.absInjust+" abscence(s) non justifiée(s)");

        }else{
            System.out.println(this.getNom()+" ne peut pas valider son année car ses absences insjutifiées sont supérieur à 5");
            System.out.println(this.getNom()+" doit  remboursé sa bourse car il a "+this.absInjust+" abscence(s) non justifiée(s)");
        }
    }
    
}
