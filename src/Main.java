// Arthur Moreira Correa NUSP: 13749952
public class Main {
    public static void main(String[] args) {
        // Creating a new animal object using the factory method.
        Animal lion = Mammal.get("Mufasa", "Lion");
        System.out.println("Name: " + lion.getName());
        System.out.println("Specie: " + lion.getSpecies());
        // Because the get method in Mammal.java returns a Animal interface type and not a Ecology interface type, we can't access the getHabitat method from the Lion class.
        System.out.println("Habitat: " + ((Ecology)lion).getHabitat());
        System.out.print("Sound: ");
        lion.sound();
        System.out.print("Eats: ");
        lion.eat();
        System.out.println();

        // Creating a new animal object using the factory method.
        Animal elephant = Mammal.get("Dumbo", "Elephant");
        System.out.println("Name: " + elephant.getName());
        System.out.println("Specie: " + elephant.getSpecies());
        // Because the get method in Mammal.java returns a Animal interface type and not a Ecology interface type, we can't access the getHabitat method from the Elephant class.
        System.out.println("Habitat: " + ((Ecology)elephant).getHabitat());
        System.out.print("Sound: ");
        elephant.sound();
        System.out.print("Eats: ");
        elephant.eat();
        System.out.println();

        // Creating a new animal object using the factory method, but with a invalid specie.
        Animal dog = Mammal.get("Rex", "Dog");
        try{
            System.out.println("Name: " + dog.getName());
            System.out.println("Specie: " + dog.getSpecies());
            System.out.println("Habitat: " + ((Ecology)dog).getHabitat());
            System.out.print("Sound: ");
            dog.sound();
            System.out.print("Eats: ");
            dog.eat();
            System.out.println();
        }catch(NullPointerException e){
            System.out.println("Rex can't be created, because Dog is not a valid specie.");
        }
    }
}
