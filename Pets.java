public class Pets {

    public static void main(String[] args) {

        TalkingCat garfield = new TalkingCat("Garfield");
        System.out.println(garfield.speak());
        garfield.feed();
        System.out.println(garfield.speak());

        Dog odie = new Dog("Odie");

        Horse horse = new Horse("Seabiscuit");
        System.out.println(horse.isHappy());
        horse.brush();
        horse.ride();
        horse.feed();
        horse.walk();
        horse.pet();
        System.out.println(horse.isHappy());

    }

}