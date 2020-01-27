public class Pets {

    public static void main(String[] args) {

        TalkingCat garfield = new TalkingCat("Garfield");
        System.out.println(garfield.speak());
        System.out.println(garfield.speak());
        System.out.println(garfield.speak());
        garfield.feed();
        System.out.println(garfield.speak());
        System.out.println(garfield.speak());

        Dog odie = new Dog("Odie");

    }

}