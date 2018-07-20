public class ReadHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我是红头鸭子");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("红头鸭子飞飞飞");
    }
}
