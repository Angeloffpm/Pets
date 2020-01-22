public class Cat extends Pet {

    //constructor
    public Cat(String name){
        super(name);
    }

    //functions
    public boolean isHappy(){
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

}

    