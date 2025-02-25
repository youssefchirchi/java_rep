package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal  {
    protected String habitat ;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
    public abstract void swim();

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic aquatic = (Aquatic) obj;

        return this.age == aquatic.age &&
                this.name.equals(aquatic.name) &&
                this.habitat.equals(aquatic.habitat);
    }
}
