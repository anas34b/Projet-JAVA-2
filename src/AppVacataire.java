// Programme Test Enseignants Vacataires

public class AppVacataire {
    public class App {
        public static void main(String[] args) throws Exception {
            EnseignantVacataire vidal= new EnseignantVacataire("Valida", "vincent", 50, 0, 0, 0, 50);
            System.out.println(vidal.toString());
            vidal.calculeSalaireInitiale();
            System.out.println(vidal.toString());
            vidal.setabsInjust(5);
            System.out.println(vidal.toString());
            vidal.calculeSalaireAbsInjust();
            System.out.println(vidal.toString());
        }
    }
}
