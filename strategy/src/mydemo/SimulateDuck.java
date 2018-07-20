package mydemo;

public class SimulateDuck {
    public static void main(String[] args) {
        ModuleDuck moduleDuck = new ModuleDuck();
        moduleDuck.performFly();

        //动态的改变鸭子的飞行
        moduleDuck.setFlyBehavior(new FlyWithRocket());
//        moduleDuck.setFlyBehavior(new FlyWithWings());
        moduleDuck.performFly();

        //封装抽取出来的FlyWithWings也能够被其他类(SomeBird)复用
        SomeBird someBird = new SomeBird();
        someBird.performFly();

    }
}
