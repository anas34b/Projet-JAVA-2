// Programme Test Etudiants Boursiers et Non Boursier
public class App {
    //for test
    public static void main(String[] args) throws Exception {
        EtudiantNonBoursier anas= new EtudiantNonBoursier( "daoui", "anas", 21, 0, 0);
        EtudiantBoursier alcal= new EtudiantBoursier("alcal", "diaby" , 20, 0, 0);
        System.out.println(anas.toString());
        System.out.println(alcal.toString());
        anas.affichValidationBaseSurAbscence();
        alcal.affichValidationBaseSurAbscenceEtRemboursementBourse();
        anas.setAbsInjust(6);
        alcal.setAbsInjust(7);
        anas.affichValidationBaseSurAbscence();
        alcal.affichValidationBaseSurAbscenceEtRemboursementBourse();

    }
}
