### README pour la TD - Preparation Examen PROG2

Cette application permet de modéliser l'embarquement de véhicules (camions et voitures) dans un car ferry, en gérant les conducteurs, le ravitaillement en carburant, et la gestion des colis et des passagers.

## Fonctionnalités

- **Personne** : Caractérisée par un nom, prénom, date de naissance, adresse, et poids. Possède une méthode `voyager`.
- **Voyageur** : Une personne ayant une date de voyage.
- **Conducteur** : Un voyageur ayant un numéro de permis.
- **Véhicule** : Caractérisé par son modèle, immatriculation, kilométrage, poids à vide, longueur, réserve de carburant et un conducteur. Possède les méthodes suivantes :
  - `changerConducteur` : Change le conducteur d'un véhicule.
  - `getPoids` : Retourne le poids du véhicule (poids à vide + poids du carburant + poids de la charge).
  - `allerAlaPompe` : Ajoute une certaine quantité de carburant au véhicule.
  - `rouler` : Permet de parcourir une certaine distance avec un certain taux de consommation. Lève une exception si le véhicule n'a pas de conducteur ou si la quantité de carburant est insuffisante.
- **Camion** : Un véhicule pouvant transporter une cargaison de colis. Possède les méthodes :
  - `ajouterColis` : Ajoute un colis à la cargaison.
  - `retirerColis` : Retire un colis de la cargaison.
- **Voiture** : Un véhicule pouvant transporter un nombre limité de passagers. Possède les méthodes :
  - `monter` : Fait monter un passager dans la voiture (lève une exception si la voiture est pleine).
  - `descendre` : Fait descendre un passager de la voiture et retourne vrai si la personne a été trouvée et retirée.
- **Car Ferry** : Un véhicule pouvant transporter des voitures ou des camions. Possède les méthodes :
  - `embarquer` : Permet d'embarquer un véhicule.
  - `debarquer` : Permet de débarquer un véhicule.
  - `chercherVoyageur` : Permet de savoir si une personne (conducteur ou passager) se trouve sur le car ferry.

## Exemple d'utilisation

```java
public class App {
    public static void main(String[] args) {
        Conducteur conducteur1 = new Conducteur("tsong", "andria", "27-08-2001", "Mon adresse", 70, "123TR");

        Camion camion = new Camion("Nissan", "1012TBE", 120, 500, 15, 0);
        camion.changerConducteur(conducteur1);
        camion.allerAlaPompe(100);

        Colis colis1 = new Colis("porte", 100);
        camion.ajouterColis(colis1);

        System.out.println(camion.getPoids());

        CarFerry carFerry1 = new CarFerry("grand car", "23TR", 200, 200, 10, 0);
        carFerry1.allerAlaPompe(20);
        carFerry1.changerConducteur(conducteur1);

        System.out.println(carFerry1.getPoids());
    }
}
```

Ce code crée un conducteur, un camion, un colis, et un car ferry, puis effectue diverses opérations comme l'attribution du conducteur, le ravitaillement en carburant, et l'ajout de colis.