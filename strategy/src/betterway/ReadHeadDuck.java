package betterway;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackXixi();
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭子");
    }
}
