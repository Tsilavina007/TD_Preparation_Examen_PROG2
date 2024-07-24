public class Conducteur extends Personne {
    private String numDePermis;

    public Conducteur(String nom, String prenom, String dateDeNaissance, String adresse, int poids, String numDePermis) {
        super(nom, prenom, dateDeNaissance, adresse, poids);
        this.numDePermis = numDePermis;
    }
    
}
