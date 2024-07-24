/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Conducteur conducteur1 = new Conducteur("tsong", "andria", "27-08-2001", "Mon adresse", 70, "123TR");

        Camion camion = new Camion("Nissan", "1012TBE", 120, 500, 15, 0);

        camion.changerConducteur(conducteur1);
        camion.allerAlaPompe(100);

        Colis colis1 = new Colis("porte", 100);

        camion.ajouterColis(colis1);
        // camion.retirerColis(colis11);

        System.out.println(camion.getPoids());

        CarFerry carFerry1 = new CarFerry("grand car", "23TR", 200, 200, 10, 0);

        carFerry1.allerAlaPompe(20);

        // carFerry1.embarquer(camion);

        carFerry1.changerConducteur(conducteur1);

        System.out.println(carFerry1.getPoids());

        // camion.rouler(20000, 10000);



    }
}