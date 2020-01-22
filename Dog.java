public class Dog extends Pet {

    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Functions

    public String bark() {
    
        if (isHappy()) {
            return "WOOF!";
        } else {
            return "woof";
        }

    }

}