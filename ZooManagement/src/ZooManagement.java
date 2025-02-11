import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Animal lion = new Animal("felin", "lion", 5, true);
        Animal tigre = new Animal("felin", "tigre", 5, true);
        Animal elephant = new Animal("Mammifère", "Éléphant", 10, false);
        Animal lionDuplicate = new Animal("Félin", "Lion", 6, true);

        Zoo zoo = new Zoo("zoofalouja","newyork");
        zoo.addAnimal(lion);       // ✅ Doit réussir
        zoo.addAnimal(tigre);      // ✅ Doit réussir
        zoo.addAnimal(elephant);   // ✅ Doit réussir
        zoo.addAnimal(lionDuplicate);
        int indexLion = zoo.searchAnimal(lion);
        int indexPanda = zoo.searchAnimal(new Animal("Mammifère", "Panda", 3, true));

        System.out.println("📍 Indice de 'Lion' : " + indexLion); // ✅ Doit retourner un indice valide (0, 1 ou 2)
        System.out.println("📍 Indice de 'Panda' : " + indexPanda);

        zoo.displayZoo();

    }

}