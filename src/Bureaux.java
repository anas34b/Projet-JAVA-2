
import java.util.Arrays;

public class Bureaux {
    private final int nbBureau;
    private int nbPersonnelBu;
    private Salarie[] PersonnelBu;
    static public int compt=0;
    Bureaux() { 
        nbBureau=compt+1;
        nbPersonnelBu=0;
        PersonnelBu=new Salarie[3];
    }
    /**
     * Si il y a plus de trois personnes dans le bureau alors il est rempli.
     * Sinon on rajoute une personne de plus
     * @param p
     */
    public void ajouterOccupant(Salarie p) {
        if(nbPersonnelBu+1>3) { 
            System.out.println("Le bureau est plein, veuillez choisir un autre bureau ou creer un autre.");
        }
        else {
            PersonnelBu[nbPersonnelBu++]=p; 
        }
    }
}
