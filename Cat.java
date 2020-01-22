public class Cat {

    private boolean fed;
    private boolean walked;
    private boolean petted;

    //constructor

    public Cat(boolean fed, boolean walked, boolean petted){
        this.fed = fed;
        this.walked = walked;
        this.petted = petted;
    }

    //functions
    public boolean happyCat(){
        if(fed && !walked && !petted){
            return true;
        }
        return false;
    }


    public String hissOrMeow(boolean HappyCat){
        if(HappyCat){
            return "Meow";
        }
        return "HISSS";
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


}