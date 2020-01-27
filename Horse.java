public class Horse extends Pet {

    private boolean hasBeenBrushed;
    private boolean hasBeenRidden;

    // Constructor
    public Horse(String name) {
        super(name);
    }

    // Setters
    public void brush() {
        this.hasBeenBrushed = true;
    }

    public void ride() {
        this.hasBeenRidden = true;
    }

    // Functions
    public boolean isHappy() {
        return (super.isHappy() && hasBeenBrushed && hasBeenRidden);
    }

}