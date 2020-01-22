public class Pet {

    private String name;

    private boolean hasBeenWalked;
    private boolean hasBeenPetted;
    private boolean hasBeenFed;

    // Constructor
    public Pet(String name) {
        this.name = name;
    }

    // Setters
    public void feed() {
        this.hasBeedFed = true;
    }

    public void walk() {
        this.hasBeenWalked = true;
    }
    
    public void pet() {
        this.hasBeenPetted = true;
    }

    // Functions
    public boolean isHappy() {
        return fed && walked && petted;
    }

}