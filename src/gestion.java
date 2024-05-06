import java.lang.instrument.UnmodifiableClassException;

public class gestion {
    
    public static final int nbMaxEtu=100;
    public static  int nbEtu=0;
    public static final int nbMaxProfV=100;
    public static  int nbProfV=0;
    public static final int nbMaxProfT=100;
    public static  int nbProfT=100;

    private EtudiantBoursier tablEtudiantBoursier[]= new EtudiantBoursier[nbMaxEtu];
    private EtudiantNonBoursier tablEtudiantNonBoursier[]= new EtudiantNonBoursier[nbMaxEtu];
//gestion des etudiant
    /**
     * gestion des etudiants
     *  Ajout Etudiant Non Boursier
     */
    public  void ajouterUnEtudNonBour(){
        if(nbEtu+1>nbMaxEtu){
           System.out.println("Impossible d'ajouter l'etudiant car on va depasser le nombre etudiant maximum");
        }else{
        System.out.print("Veuillez saisir le nom de l'etudiant : ");
                String nom = Clavier.lireString();
                System.out.print("\nVeuillez saisir le prenom de l'etudiant : ");
                String prenom = Clavier.lireString();
                System.out.print("\nVeuillez saisir l'age de l'etudiant : ");
                int age = Clavier.lireInt();
                tablEtudiantNonBoursier[nbEtu+1]= new EtudiantNonBoursier(nom, prenom, age, 0, 0);
                nbEtu+=1;
        }
                
    }

    /**
     * Suppression Etudiant Non Boursier
     */
    public void suppUnEtudNonBour(){ 
        EtudiantNonBoursier Liste[] = new EtudiantNonBoursier[nbEtu];
        System.out.print("Veuillez saisir le nom de l'etudiant à supprimer : ");
                String nom = Clavier.lireString();
                System.out.print("\nVeuillez saisir le prenom de l'etudiant à supprimer : ");
                String prenom = Clavier.lireString();
        for (int i = 0; i < tablEtudiantNonBoursier.length-1; i++) {
            if(tablEtudiantNonBoursier[i].getNom() == nom && tablEtudiantNonBoursier[i].getPrenom()==prenom ){
                for(int index = 0; index < i; index++){
                    Liste[index] = tablEtudiantNonBoursier[index];
                }
                for(int j = i; j < tablEtudiantNonBoursier.length - 1; j++){
                    Liste[j] = tablEtudiantNonBoursier[j+1];
                }
            }
        }
        for(int i=0;i<tablEtudiantNonBoursier.length-1;i++){
            tablEtudiantNonBoursier[i]=Liste[i];
        }
        nbEtu-=1;

    }

    /**
     * Ajout Etudiant Boursier
     */
    public  void ajouterUnEtudBour(){
        if(nbEtu+1>nbMaxEtu){
           System.out.println("Impossible d'ajouter l'etudiant car on va depasser le nombre etudiant maximaum");
        }else{
        System.out.print("Veuillez saisir le nom de l'etudiant : ");
                String nom = Clavier.lireString();
                System.out.print("\nVeuillez saisir le prenom de l'etudiant : ");
                String prenom = Clavier.lireString();
                System.out.print("\nVeuillez saisir l'age de l'etudiant : ");
                int age = Clavier.lireInt();
                tablEtudiantBoursier[nbEtu+1]= new EtudiantBoursier(nom, prenom, age, 0, 0);
        }
        nbEtu+=1;

    }

    /**
     * Suppression Etudiant Boursier
     */
    public void suppUnEtudBour(){//
        EtudiantBoursier Liste[] = new EtudiantBoursier[nbEtu];
        System.out.print("Veuillez saisir le nom de l'etudiant à supprimer : ");
                String nom = Clavier.lireString();
                System.out.print("\nVeuillez saisir le prenom de l'etudiant à supprimer : ");
                String prenom = Clavier.lireString();
        for (int i = 0; i < tablEtudiantBoursier.length-1; i++) {
            if(tablEtudiantBoursier[i].getNom() == nom && tablEtudiantBoursier[i].getPrenom()==prenom ){
                for(int index = 0; index < i; index++){
                    Liste[index] = tablEtudiantBoursier[index];
                }
                for(int j = i; j < tablEtudiantBoursier.length - 1; j++){
                    Liste[j] = tablEtudiantBoursier[j+1];
                }
            }
        }
        for(int i=0;i<tablEtudiantNonBoursier.length-1;i++){
            tablEtudiantBoursier[i]=Liste[i];
        }
        nbEtu-=1;

    }
    
    /**
     * Gestion Absences
     */
    public void afficheEtuAbscNonJustif(){// Affiche les etudiants avec plus de 5 absences injustifiées
        System.out.println("les etudiants boursiers qui ont plus que 5 abscences injustifiées : ");
        for(int i=0;i<tablEtudiantBoursier.length;i++){
            if(tablEtudiantBoursier[i].getAbsInjust()>=5){
                System.out.println("l'étudiant Boursier "+tablEtudiantBoursier[i].getNom()+" "+tablEtudiantBoursier[i].getPrenom()+" à plus que 5 abscence injustifie");
            }
        }
        for(int i=0;i<tablEtudiantNonBoursier.length;i++){
            if(tablEtudiantNonBoursier[i].getAbsInjust()>=5){
                System.out.println("l'étudiant non Boursier "+tablEtudiantNonBoursier[i].getNom()+" "+tablEtudiantNonBoursier[i].getPrenom()+" à plus que 5 abscence injustifie");
            }
        }
    }
    /**
     * Affiche Etudiant Boursier
     */
    public void afficheEtuBoursier(){//
        for(int i=0;i<tablEtudiantBoursier.length;i++){
            System.out.println(tablEtudiantBoursier.toString());
        }
    }
    /**
     * Affiche Etudiant Non Boursier
     */
    public void afficheEtuNonBoursier(){
        for(int i=0;i<tablEtudiantNonBoursier.length;i++){
            System.out.println("\n"+ tablEtudiantNonBoursier.toString());
        }
    }


///////////////////////////////////////////////////////////////////////////////////////////////
/**
 *
 */
private EnseignantVacataire tablEnseignantVacataire[]= new EnseignantVacataire[nbMaxProfV];
/**
 *
 */
private EnseignantTitulaire tablEnseignantTitulaire[]= new EnseignantTitulaire[nbMaxProfT];

/**
 * Gestion Enseignant
 * Ajout Enseingnant Vacataire
 */
public  void ajouterUnProfV(){ 
    if(nbProfV+1>nbMaxProfV){
       System.out.println("Impossible d'ajouter le Enseignant Vacataire car on va depasser le nombre Enseignant Vacataire maximaum");
    }else{
    System.out.print("Veuillez saisir le nom de Enseignant Vacataire: ");
            String nom = Clavier.lireString();
            System.out.print("\nVeuillez saisir le prenom de Enseignant Vacataire: ");
            String prenom = Clavier.lireString();
            System.out.print("\nVeuillez saisir l'age de Enseignant Vacataire: ");
            int age = Clavier.lireInt();
            System.out.print("\nVeuillez saisir le nombre d'heure de travail de Enseignant Vacataire: ");
            double nbHeure = Clavier.lireFloat();

            tablEnseignantVacataire[nbProfV+1]= new EnseignantVacataire(nom, prenom, age, 0, 0,0,nbHeure);
            tablEnseignantVacataire[nbProfV+1].calculeSalaireInitiale();
    }
    nbProfV+=1;
}

/**
 * Suppression Enseignant Vacataire
 */
public void SuppUnProfV(){
    EnseignantVacataire Liste[] = new EnseignantVacataire[nbProfV];
    System.out.print("Veuillez saisir le nom de l'Enseignant Vacataire à supprimer : ");
            String nom = Clavier.lireString();
            System.out.print("\nVeuillez saisir le prenom de l'Enseignant Vacataire à supprimer : ");
            String prenom = Clavier.lireString();
    for (int i = 0; i < tablEnseignantVacataire.length-1; i++) {
        if(tablEnseignantVacataire[i].getNom() == nom && tablEnseignantVacataire[i].getPrenom()==prenom ){
            for(int index = 0; index < i; index++){
                Liste[index] = tablEnseignantVacataire[index];
            }
            for(int j = i; j < tablEnseignantVacataire.length - 1; j++){
                Liste[j] = tablEnseignantVacataire[j+1];
            }
        }
    }
    for(int i=0;i<tablEnseignantVacataire.length-1;i++){
        tablEnseignantVacataire[i]=Liste[i];
    }
    nbProfV-=1;
}
 
/**
 * Ajout Enseignant Titulaire
 */
public  void ajouterUnProfT(){
    if(nbProfT+1>nbMaxProfT){
       System.out.println("Impossible d'ajouter le Enseignant Titulaire car on va depasser le nombre Enseignant Vacataire maximum");
    }else{
    System.out.print("Veuillez saisir le nom de Enseignant Titulaire: ");
            String nom = Clavier.lireString();
            System.out.print("\nVeuillez saisir le prenom de Enseignant Titulaire: ");
            String prenom = Clavier.lireString();
            System.out.print("\nVeuillez saisir l'age de Enseignant Titulaire: ");
            int age = Clavier.lireInt();
            System.out.print("\nVeuillez saisir le nombre d'heure de travail de Enseignant Titulaire: ");
            double nbHeure = Clavier.lireFloat();
            System.out.print("\nVeuillez saisir le taux de salaire de Enseignant Titulaire: ");
            double tauxSalaireT = Clavier.lireDouble();

            tablEnseignantTitulaire[nbProfT+1]= new EnseignantTitulaire(nom, prenom, age, 0, 0,0,nbHeure,tauxSalaireT);
            tablEnseignantTitulaire[nbProfT+1].calculeSalaireInitiale();
    }
    nbProfT+=1;

}

/**
 * Suppression Prof Titulaire
 */
public void SuppUnProfT(){
    EnseignantTitulaire Liste[] = new EnseignantTitulaire[nbProfT];
    System.out.print("Veuillez saisir le nom de l'Enseignant Titulaire à supprimer : ");
            String nom = Clavier.lireString();
            System.out.print("\nVeuillez saisir le prenom de l'Enseignant Titulaire à supprimer : ");
            String prenom = Clavier.lireString();
    for (int i = 0; i < tablEnseignantTitulaire.length-1; i++) {
        if(tablEnseignantTitulaire[i].getNom() == nom && tablEnseignantTitulaire[i].getPrenom()==prenom ){
            for(int index = 0; index < i; index++){
                Liste[index] = tablEnseignantTitulaire[index];
            }
            for(int j = i; j < tablEnseignantTitulaire.length - 1; j++){
                Liste[j] = tablEnseignantTitulaire[j+1];
            }
        }
    }
    for(int i=0;i<tablEnseignantTitulaire.length-1;i++){
        tablEnseignantTitulaire[i]=Liste[i];
    }
    nbProfT-=1;
}
public void afficheProfT(){
    for(int i=0;i<tablEnseignantTitulaire.length;i++){
        System.out.println("\n"+ tablEnseignantTitulaire.toString());
    }
}
public void afficheProfV(){
    for(int i=0;i<tablEnseignantVacataire.length;i++){
        System.out.println("\n"+ tablEnseignantVacataire.toString());
    }
}





}
