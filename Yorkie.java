public class Yorkie extends Dog {

    private int timesPet = 0;

    // Constructor
    
    public Yorkie(String name) {
        super(name);
    }

    // Functions

    public void pet() {
        super.pet();
        timesPet++;
    }

    public boolean isHappy() {

        if (timesPet >= 10) return true;
        return false;

    }

}