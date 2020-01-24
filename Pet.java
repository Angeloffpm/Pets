public class Pet {

    private String name;

    private boolean hasBeenFed;
    private boolean hasBeenWalked;
    private boolean hasBeenPetted;

    // Constructor
    public Pet(String name) {
        this.name = name;
    }

    // Setters
    public void feed() {
        this.hasBeenFed = true;
    }

    public void walk() {
        this.hasBeenWalked = true;
    }
    
    public void pet() {
        this.hasBeenPetted = true;
    }

    // Getters
    public boolean hasBeenWalked() {
        return this.hasBeenWalked;
    }

    public boolean hasBeenPetted() {
        return this.hasBeenPetted;
    }

    public boolean hasBeenFed() {
        return this.hasBeenFed;
    }

    // Functions
    public boolean isHappy() {
        return hasBeenFed && hasBeenWalked && hasBeenPetted;
    }

    public String speak() {
        return "Hello!";
    }

}