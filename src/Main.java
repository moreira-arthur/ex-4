public class Main {
    public static void main(String[] args) {
        Mammal animal =  Mammal.get("Lion");
        System.out.println(animal.getName());
        System.out.println(animal.getSpecies());
        System.out.println(animal.getHabitat());
        animal.eat();
        animal.sound();
        System.out.println();
        animal = Mammal.get("Elephant");
        System.out.println(animal.getName());
        System.out.println(animal.getSpecies());
        System.out.println(animal.getHabitat());
        animal.eat();
        animal.sound();
        System.out.println();
        animal = Mammal.get("Dog");

    }
}
