public class PetOwner {

    private Pet[] pets;

    // Constructor
    public PetOwner(Pet[] pets) {
        this.pets = pets;
    }

    // Functions
    public boolean isHappy() {

        boolean happy = true;

        for (int i = 0; i < pets.length; i++) {
            if (!pets[i].isHappy()) happy = false;
        }

        return happy;

    }


}