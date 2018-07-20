package betterway;

public class FakeDuck extends Duck {

    public FakeDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new QuackZizi();
    }

    @Override
    public void display() {
        System.out.println("我是假鸭子");
    }
}
