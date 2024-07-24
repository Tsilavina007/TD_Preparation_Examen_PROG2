import java.util.ArrayList; 

public class Camion extends Vehicule {
    private ArrayList<Colis> cargaison ;

    public Camion(String modele, String immatriculation, int kilometrage, int poidsVide, int longueur,
            int carburantReservoir) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, carburantReservoir);
        this.cargaison = new ArrayList<Colis>();
    }

    public void ajouterColis(Colis newColis) {
        this.cargaison.add(newColis);
        System.out.println("Colis ajouter");

    }

    public void retirerColis(Colis delColis) {
        int index = this.cargaison.indexOf(delColis);
        if (index != -1) {     
            this.cargaison.remove(index);
            System.out.println("Colis retiré dans la cargaison");
        } else {
            System.out.println("Colis non trouvé dans la cargaison");
        }
    }

    @Override
    public double getPoids() {
        int colisPoids = 0;

        for (Colis colis : this.cargaison) {
            colisPoids += colis.getPoidsColis();
        } 
        if (this.conducteur == null) {
            return this.poidsVide + this.carburantReservoir+ colisPoids;
        } else {
            return this.poidsVide + this.carburantReservoir + this.conducteur.getPoidsPersonne() + colisPoids;
        }
    }
    
}
