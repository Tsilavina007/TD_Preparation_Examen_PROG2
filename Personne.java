public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String dateDeNaissance;
    protected String adresse;
    protected int poids;

    public Personne(String nom, String prenom, String dateDeNaissance, String adresse, int poids){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.poids = poids ;
    }

    public int getAge() {
        String [] parts = this.dateDeNaissance.split("-");
        int res = 2024 - Integer.parseInt(parts[2]);
        return res;
    }

    public void voyager() {
        System.out.println(this.nom + " voyage");
    }

    public int getPoidsPersonne() {
        return this.poids;
    }
}
