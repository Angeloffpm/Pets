public class Dog extends Pet {

    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Functions

    public String speak() {
    
        if (isHappy()) {
            return "WOOF!";
        } else {
            return "woof";
        }

    }

    public void pet() {
        super.pet();
    }

}