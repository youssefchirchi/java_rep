package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "[Family: " + family + ", Name: " + name + ", Age: " + age + ", Is Mammal: " + isMammal + "]";
    }

    public void setAge(int age) {
        if (age<0)
            System.out.println("📍ne peux pas etre negatif");
        else
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}
