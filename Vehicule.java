public class Vehicule {
    protected String modele;
    protected String immatriculation;
    protected int kilometrage;
    protected int poidsVide;
    protected int longueur;
    protected int carburantReservoir;
    protected Conducteur conducteur;

    public Vehicule(String modele, String immatriculation, int kilometrage, int poidsVide, int longueur, int carburantReservoir) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.poidsVide = poidsVide;
        this.longueur = longueur;
        this.carburantReservoir = carburantReservoir;
        this.conducteur = null;
    }
    

    public void changerConducteur(Conducteur nouveauConducteur) {
        if (nouveauConducteur.getAge() < 18) {
            System.out.println("Changement conducteur non reussi !");
        } else {
            this.conducteur = nouveauConducteur;
            System.out.println("Changement conducteur reussi !");
        }
        
    }

    public void allerAlaPompe(int carburant) {
        this.carburantReservoir += carburant;
        System.out.println("Ajout carburant reussi !");
    }

    public double getPoids() {
        return this.poidsVide + this.carburantReservoir + this.conducteur.getPoidsPersonne();
    }

    public void rouler(int distance, int tauxDeConsommationDistanceParLitre) {
        if (distance/tauxDeConsommationDistanceParLitre > this.carburantReservoir || this.conducteur == null) {
            System.out.println("Le vehicule ne roule pas !");
        } else {
            this.carburantReservoir -= (distance/tauxDeConsommationDistanceParLitre);
            System.out.println("Le vehicule roule");
        }
    }
}

