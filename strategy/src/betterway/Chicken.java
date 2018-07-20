package betterway;

public class Chicken {

    FlyBehavior flyBehavior;

    public Chicken() {
        flyBehavior = new FlyWithWings();
    }

    public void perforFly() {
        System.out.println("i am a chicken and i can fly");
        flyBehavior.fly();
    }

}
