import java.util.ArrayList;

public class CarFerry extends Vehicule {
    private ArrayList<Vehicule> vehiculesArrayList ;

    public CarFerry(String modele, String immatriculation, int kilometrage, int poidsVide, int longueur,
            int carburantReservoir) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, carburantReservoir);
        this.vehiculesArrayList = new ArrayList<Vehicule>();
    }

    public void embarquer(Vehicule vehicule) {
        vehiculesArrayList.add(vehicule);
        System.out.println("Un véhicule embarqué");
    }

    public void debarquer(Vehicule vehicule) {
        int index = vehiculesArrayList.indexOf(vehicule);
        if (index != -1) {
            vehiculesArrayList.remove(index);
            System.out.println("Un véhicule débarqué");
        }
    }

    @Override
    public double getPoids() {
        int vehiculesPoids = 0;

        for (Vehicule vehicule : this.vehiculesArrayList) {
            vehiculesPoids += vehicule.getPoids();
        }
        
        if (this.conducteur == null) {
            return this.poidsVide + this.carburantReservoir + vehiculesPoids;
        } else {
            return this.poidsVide + this.carburantReservoir + this.conducteur.getPoidsPersonne() + vehiculesPoids;
        }
    }

    public void chercherVoyageur() {
        System.out.println("Recherche en cours");
    }

}
