public class Voyageur extends Personne {
    private String dateDeVoyage;

    public Voyageur(String nom, String prenom, String dateDeNaissance, String adresse, int poids, String dateDeVoyage) {
        super(nom, prenom, dateDeNaissance, adresse, poids);
        this.dateDeVoyage = dateDeVoyage;
    }
    
}
