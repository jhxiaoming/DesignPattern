package mydemo;

public class Duck {
    FlyBehavior flyBehavior;

    //针对超类型编程
    //每个duck 都有performFly()方法

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
