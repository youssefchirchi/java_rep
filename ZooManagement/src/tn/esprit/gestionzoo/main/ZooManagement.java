package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;


public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Animal lion = new Animal("felin", "lion", 5, true);
        Animal tigre = new Animal("felin", "tigre", 5, true);
        Animal elephant = new Animal("Mammifère", "Éléphant", 10, false);
        Animal lionDuplicate = new Animal("Félin", "Lion", 6, true);
        Animal animal = new Animal("Canidae", "Wolf", 5, true);
        System.out.println(animal);

        // Creating an Aquatic instance
        Aquatic aquatic = new Aquatic("Pisces", "Shark", 10, false, "Ocean");
        System.out.println(aquatic);
        aquatic.swim();

        // Creating a Terrestrial instance
        Terrestrial terrestrial = new Terrestrial("Felidae", "Tiger", 7, true, 4);
        System.out.println(terrestrial);

        // Creating a Dolphin instance
        Dolphin dolphin = new Dolphin("Delphinidae", "Bottlenose Dolphin", 8, true, "Sea", 25.5f);
        System.out.println(dolphin);
        dolphin.swim();

        // Creating a Penguin instance
        Penguin penguin = new Penguin("Spheniscidae", "Emperor Penguin", 4, false, "Antarctica", 50.0f);
        System.out.println(penguin);
        penguin.swim();

    }

}