package mydemo;

//模型鸭子
public class ModuleDuck extends Duck {

    public ModuleDuck() {
       flyBehavior=new FlyNoWay();
    }
}
