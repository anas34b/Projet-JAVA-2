import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        gestion gestion= new gestion();
        int choice;
        do{
            System.out.println("Choisie ton action\n");
            System.out.print("1.) Créer un étudiant boursier \n");
            System.out.print("2.) Créer un étudiant non boursier\n");
            System.out.print("3.) afficher tout les étudiant boursier\n");
            System.out.print("4.) afficher tout les étudiant non boursier\n");
            System.out.print("5.) afficher tout les étudiant qui ont plus que 5 abscences\n");
            System.out.print("6.) supprimer un etudiant boursier\n");
            System.out.print("7.) supprimer un etudiant non boursier\n");
            System.out.print("8.) Créer un enseignant vacataire \n");
            System.out.print("9.) Créer un enseignant titulaire\n");
            System.out.print("10.) afficher tout les enseignant vacataire\n");
            System.out.print("11.) afficher tout les enseignant titulaire\n");
            System.out.print("12.) Exit\n");
            System.out.print("\nEnter votre choix: ");
            choice = input.nextInt();




        switch(choice){

        case 1:
            gestion.ajouterUnEtudBour();
            break;

        case 2: 
            gestion.ajouterUnEtudNonBour();
            break;

        case 3:
            gestion.afficheEtuBoursier();
            break;

        case 4: 
            gestion.afficheEtuNonBoursier();
            break;

        case 5:
            gestion.afficheEtuAbscNonJustif();
            break;
        
        case 6:
            gestion.suppUnEtudBour();;
            break;
        case 7:
            gestion.suppUnEtudNonBour();;
            break;
        case 8:
            gestion.ajouterUnProfV();
            break;
        case 9:
            gestion.ajouterUnProfT();
            break;
        case 10:
            gestion.afficheProfV();
            break;
        case 11:
            gestion.ajouterUnProfT();
            break;

        case 12: 
            System.out.println("Sortie du programme");
            System.exit(0);
             break;
        default:
        System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

        }}while(choice != 12 /*Exit loop when choice is 6*/);

input.close();

    }
       
}