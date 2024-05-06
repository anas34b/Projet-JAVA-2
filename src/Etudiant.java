// Classe Etudiant qui hérite de la classe Personne
public class Etudiant extends Personne {
        /**
         * Attribut privée
         */
        private int absJust;
        /**
         * Attribut protégé
         */
        protected int absInjust;
        /**
         * Attribut de la classe
         * @param nom
         * @param prenom
         * @param age
         * @param absJust
         * @param absInjust
         */
        public Etudiant(String nom, String prenom, int age, int absJust, int absInjust) {
            super(nom, prenom, age);
            this.absJust = absJust;
            this.absInjust = absInjust;
        }
        /**
         * Retourne les absences Justifiées
         * @return
         */
        public int getAbsJust() {
            return absJust;
        }
        /**
         * Initialisation de ce paramètre
         * @param absJust
         */
        public void setAbsJust(int absJust) {
            this.absJust = absJust;
        }
        /**
         * Retourne les absences Injustifiées
         * @return
         */
        public int getAbsInjust() {
            return absInjust;
        }
        /**
         * Initialisation de ce paramètre
         * @param absInjust
         */
        public void setAbsInjust(int absInjust) {
            this.absInjust = absInjust;
        }
        
        /* (non-Javadoc)
         * @see Personne#toString()
         * Adapter l'affichage des attributs de la classe
         */
        @Override
        public String toString() {
            return super.toString()+" ,EtudiantNonBoursier, absJust=" + absJust + ", absInjust=" + absInjust ;
        }
}
