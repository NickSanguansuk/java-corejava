package topics.oop_programming.encapsulation;

public class Animal {

    // Data
    // If this class is a parent class, we should declare variables "protected"
    // If this class is a child class only, we should declare variables "private"
    private static String kingMessage;

    protected String animalName;
    protected String animalType;
    protected int height;
    protected String color;

    // Constructors
    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public Animal(String animalName, String animalType, int height, String color) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.height = height;
        this.color = color;
    }

    // Methods
    //public static String getKingMessage() {
    //    return kingMessage;
    //}
    //
    //public static void setKingMessage(String kingMessage) {
    //    Animal.kingMessage = kingMessage;
    //}

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
