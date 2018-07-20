package betterway2;

public class MiniDuckSimulate2 {

    public static void main(String[] args) {
        Duck moduleDuck = new ModuleDuck();

        moduleDuck.performFly();

        moduleDuck.setFlyBehavior(new PoweredFly(){
            @Override
            public void fly() {
                super.fly();
                //......
            }
        });

        moduleDuck.performFly();


    }

}
