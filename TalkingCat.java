import java.util.Random;

public class TalkingCat extends Cat {

    Random rand = new Random();

    private final String[] compliments = {
        "Great Work",
        "MMMM lasagna",
        "I love what your doing here john",
        "Odie nice work!",
        "Awesome"
    };

    private final String[] insults = {
        "Eww this lasagna is cold",
        "John your fat and that nurse will never love you",
        "I hate mondays",
        "I am hungry. Therefore I am, This is an insult",
        "When the lasagna content in my blood gets low, I get mean."
    };

    // Constructor

    public TalkingCat(String name) {
        super(name);
    }

    // Functions

    public String speak() {
        return isHappy() ? compliment() : insult();
    }

    public String insult() {
        return insults[rand.nextInt(insults.length)];
    }

    public String compliment() {
        return compliments[rand.nextInt(compliments.length)];
    }

}