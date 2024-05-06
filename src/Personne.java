public abstract class Personne {
    private final String nom;
    private final String prenom;
    private int age;
    private double tauxSalaire=42.00;

    /**
     * @return
     * Retourne le nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * @return
     * Retourne le prenom
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * @return
     * Retourne l'age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return
     * Retourne le Taux du Salaire
     */
    public double getTauxSalaire() {
        return tauxSalaire;
    }
    /**
     * @param tauxSalaire
     * Initialisationd de ce paramètre
     */
    public void setTauxSalaire(double tauxSalaire) {
        this.tauxSalaire = tauxSalaire;
    }
    
    
    /**
     * verification de contrainte
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(String nom, String prenom, int age) {//
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     * Adapter l'affichage des attributs de la classe
     */
    @Override
    public String toString() {
        return " [nom=" + nom + ", prenom=" + prenom + ", age=" + age ;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     * Verification des objets pour voir s'il sont les mêmes
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personne other = (Personne) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
    /**
     * @param age
     * Initialisation de ce paramètre
     */
    public void setAge(int age) {//
        this.age = age;
    }
    
  
}
