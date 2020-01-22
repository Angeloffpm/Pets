public class PetOwner {

    private Dog dog;
    private Cat cat;

    // Constructor
    public PetOwner(Dog dog, Cat cat) {
        
        this.dog = dog;
        this.cat = cat;

    }

    // Functions
    public boolean isHappy() {

        if (this.dog.isHappy() && this.cat.isHappy()) {
            return true;
        } else {
            return false;
        }

    }

}