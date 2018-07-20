public class MiniDuckSimulator0 {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
     //   mallardDuck.fly();  //使用从父类中继承过来的方法
        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display(); //
      //  readHeadDuck.fly();  //i cna fly  红头鸭子飞飞飞  //先找父类 super.fly()调用父类，然后在调用子类



    }

}
