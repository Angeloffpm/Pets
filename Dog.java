public class Dog {

    private boolean fed;
    private boolean walked;
    private boolean petted;

    // Constructor
    public Dog(boolean fed, boolean walked, boolean petted) {

        this.fed = fed;
        this.walked = walked;
        this.petted = petted;

    }

    // Setters (Pet Owner interactions)
    public void feed() {
        this.fed = true;
    }

    public void walk() {
        this.walked = true;
    }
    
    public void pet() {
        this.petted = true;
    }

    // Functions
    public boolean isHappy() {

        if (fed && walked && petted) {
            return true;
        } else {
            return false;
        }

    }

    public String bark() {
    
        if (isHappy()) {
            return "WOOF!";
        } else {
            return "woof";
        }

    }

}