public class Pets {

    public static void main(String[] args) {
        
        Dog louie = new Dog(false, true, false);
        Cat kenya = new Cat(false, false, true);

        PetOwner pierce = new PetOwner(louie, kenya);

        System.out.println(louie.bark());

    }

}