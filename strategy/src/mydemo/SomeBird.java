package mydemo;

public class SomeBird {

    FlyBehavior flyBehavior;

    //FlyWithWings()可以被复用
    public SomeBird() {
        flyBehavior = new FlyWithWings();
        display();
    }

    private void display() {
        System.out.println("我是一直小小鸟");
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
