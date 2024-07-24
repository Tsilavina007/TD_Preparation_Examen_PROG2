import java.util.ArrayList;

public class Voiture extends Vehicule {
    private ArrayList<Voyageur> voyageurArrayList ;


    public Voiture(String modele, String immatriculation, int kilometrage, int poidsVide, int longueur,
            int carburantReservoir) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, carburantReservoir);
        
        this.voyageurArrayList = new ArrayList<Voyageur>();
    }

    public void monter(Voyageur passager) {
        this.voyageurArrayList.add(passager);
    }

    public void descendre(Voyageur passager) {
        int index = this.voyageurArrayList.indexOf(passager);
        if (index != -1) {
            this.voyageurArrayList.remove(passager);
            System.out.println("la personne a été trouvée et retirée des passagers ");
        } else {
            System.out.println("personne non trouvée");
        }
    }

    @Override
    public double getPoids() {
        int passagerPoids = 0;

        for (Voyageur passager : this.voyageurArrayList) {
            passagerPoids += passager.getPoidsPersonne();
        }

        if (this.conducteur == null) {
            return this.poidsVide + this.carburantReservoir + passagerPoids;
        } else {
            return this.poidsVide + this.carburantReservoir + this.conducteur.getPoidsPersonne() + passagerPoids;
        }
    }
    
}
