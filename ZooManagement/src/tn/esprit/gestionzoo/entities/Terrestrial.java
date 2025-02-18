package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    int nbrLegs ;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}
