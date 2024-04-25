// Arthur Moreira Correa NUSP: 13749952

public abstract class Mammal implements Ecology,Animal {
    private String name;
    private String habitat; // In this case, habitat don`t need to be used, but it is a good practice to have it, in case it is needed in the future.
    private String specie;

    // Constructor that initializes the name, habitat and specie of the animal.
    public Mammal(String nameIn,String habitatIn, String specieIn){
        name = nameIn;
        habitat = habitatIn;
        specie = specieIn;
    }

    // Abstract methods that be implemented by the subclasses.
    public abstract void sound();
    public abstract String getHabitat();

    // Returns out the animal name.
    public String getName(){
        return name;
    }
    // Returns out the species name
    public String getSpecies(){
        return specie;
    }
    // Prints out an eating action.
    public void eat(){
        System.out.println("Eats like a mammal.");
    }

    // Factory method that returns a new animal object based on the specie, with the name given, if the specie is not valid, it prints out an error message, and returns null.
    public static Animal get(String nameIn, String specieIn){
        specieIn = specieIn.toLowerCase();
        if(specieIn.equals("lion")){
            return new Lion(nameIn);
        }else if(specieIn.equals("elephant")) {
            return new Elephant(nameIn);
        }
        System.out.println("Invalid animal specie: " + specieIn);
        return null;
    }

}

// Subclasses of Mammal, that implements the abstract methods.
class Elephant extends Mammal{
    public Elephant(String nameIn){
        super(nameIn,"Savannah", "Elephant");
    }
    public void sound(){
        System.out.println("Trumpets");
    }
    public String getHabitat(){
        return "Savana";
    }

}

// Subclasses of Mammal, that implements the abstract methods.
class Lion extends Mammal{
    public Lion(String nameIn){
        super(nameIn,"Grassland", "Lion");
    }
    public void sound(){
        System.out.println("Roars");
    }
    public String getHabitat(){
        return "Grassland";
    }
}


