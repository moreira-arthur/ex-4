// Arthur Moreira Correa NUSP: 13749952

public abstract class Mammal implements Ecology,Animal {
    // Implement the eat() method within Mammal to print out "Eats like a mammal."
    private String name;
    private String habitat;
    private String specie;

    public Mammal(String nameIn,String habitatIn){
        name = nameIn;
        habitat = habitatIn;
        specie = "Mammal";
    }

    public abstract void sound();
    public abstract String getHabitat();
    public String getName(){
        return name;
    } // Returns out the animal name.
    public String getSpecies(){
        return specie;
    } // Returns out the species name
    public void eat(){
        System.out.println("Eats like a mammal.");
    } // Prints out an eating action.


    public static Mammal get(String nameIn){
        nameIn = nameIn.toLowerCase();
        if(nameIn.equals("lion")){
            return new Lion("Lion");
        }else if(nameIn.equals("elephant")) {
            return new Elephant("Elephant");
        }
        System.out.println("Invalid animal name: " + nameIn);
        return null;
    }


}

class Elephant extends Mammal{
    public Elephant(String nameIn){
        super(nameIn,"Savana");
    }
    public void sound(){
        System.out.println("Trumpets");
    }
    public String getHabitat(){
        return "Savana";
    }

}

class Lion extends Mammal{
    public Lion(String nameIn){
        super(nameIn,"Savana");
    }
    public void sound(){
        System.out.println("Roars");
    }
    public String getHabitat(){
        return "Savana";
    }
}


