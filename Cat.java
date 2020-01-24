public class Cat extends Pet {

    //constructor
    public Cat(String name){
        super(name);
    }

    //functions
    public boolean isHappy(){
        if(hasBeenFed() && !hasBeenWalked() && !hasBeenPetted()){
            return true;
        }
        return false;
    }


    public String speak(){
        return isHappy() ? "Meow" : "HISSS";
    }

}

    