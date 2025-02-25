package tn.esprit.gestionzoo.entities;


public class Zoo {
    Animal[] animals;
    private String name;
    String city;
    final int  nbrCages;
    final int  nbrCagesaqua;
    private Aquatic[] aquaticAnimals;

    public Zoo(String name, String city) {

        this.name = name;
        this.city = city;
        this.nbrCages = 25 ;
        animals = new Animal[this.nbrCages];

    }
    public float maxPenguinSwimmingDepth(){
        float max=0;
        for(Aquatic animal : aquaticAnimals){
            if(animal instanceof Penguin penguin){
                if penguin.swimmingDepth>max{
                    max=penguin.swimmingDepth;
                }
            }
        }
    }
    public void addAquaticAnimal(Aquatic aquatic){
        this.aquaticAnimals[this.nbrCagesaqua] = aquatic;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic animal : aquaticAnimals) {
            if (animal instanceof Dolphin) {
                dolphinCount++;
            } else if (animal instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins dans le zoo : " + dolphinCount);
        System.out.println("Nombre de pingouins dans le zoo : " + penguinCount);
    }


public void displayZoo(){
        System.out.println(name + " " + city + " " + nbrCages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name=="")
            System.out.println("📍mata3tinich vide brass omok");
        else
            this.name = name;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo Name: " + name + "\n" +
                "City: " + city + "\n" +
                "Number of Cages: " + nbrCages + "\n" +
                "Number of Animals: " + nbrCages;
    }
    
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equalsIgnoreCase(animal.name)) {
                return i; // Retourne l'indice où se trouve l'animal
            }
        }
        return -1; // L'animal n'existe pas dans le zoo

    }
    public boolean isZooFull() {
        int animalCount = 0;

        // Compter le nombre d'animaux présents
        for (Animal a : animals) {
            if (a != null) {
                animalCount++;
            }
        }

        return animalCount >= nbrCages; // ✅ Retourne directement le booléen sans if inutile
    }
    public boolean addAnimal(Animal animal) {

        int animalCount = 0;

        // Compter le nombre d'animaux présents
        for (Animal a : animals) {
            if (a != null) {
                animalCount++;
            }}
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                System.out.println("⚠️ " + animal.name + " est déjà dans le zoo.");
                return false;
            }
        }
        if(isZooFull()){
            return false;
        }
        animals[animalCount++] = animal;
        System.out.println("✅ " + animal.name + " ajouté avec succès.");
        return true;
    }
    
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        // Compter le nombre d'animaux dans chaque zoo
        int animalCount1 = 0;
        int animalCount2 = 0;

        for (Animal animal : z1.animals) {
            if (animal != null) {
                animalCount1++;
            }
        }

        for (Animal animal : z2.animals) {
            if (animal != null) {
                animalCount2++;
            }
        }

        // Comparer les deux zoos et retourner celui qui a le plus d'animaux
        if (animalCount1 > animalCount2) {
            return z1;
        } else if (animalCount2 > animalCount1) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null; // Retourne null si les deux zoos ont le même nombre d'animaux
        }
    }
}
