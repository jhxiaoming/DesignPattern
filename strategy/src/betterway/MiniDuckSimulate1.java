package betterway;

public class MiniDuckSimulate1 {
    public static void main(String[] args) {
        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.performFly();
        readHeadDuck.performQuack();

        FakeDuck fakeDuck = new FakeDuck();
        fakeDuck.performFly();
        fakeDuck.performQuack();


        //分离变化以后，有翅膀飞行，就和鸭子没有关系了
        Chicken chicken = new Chicken();
        chicken.perforFly();

    }
}
