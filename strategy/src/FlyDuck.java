public class FlyDuck extends Duck implements Flyable {
    @Override
    public void display() {

    }

//    给特殊的会飞的鸭子，实现飞的方法
//但这样会有什么问题呢？
//如果会飞的鸭子子类很多，那么就要将Flyable实现多次
    //如果 有多个类型的飞的方法，那么可能需要实现多个接口
//问题来了： 我一劳永逸的写在父类中，不行
//单独的写成一个接口，单独实现该方法，也不太好？ 那怎么办？

    @Override
    public void fly() {

    }
}
