package mydemo;

public class Milk extends CondimentDecorator {

    Beverage beverage;


    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk";
    }

    @Override
    public float cost() {
        if (beverage.getSize() == "tall") {
            return 1 + beverage.cost();
        } else if (beverage.getSize() == "grande") {
            return 2 + beverage.cost();
        } else if (beverage.getSize() == "venti") {
            return 3 + beverage.cost();
        }
        //默认是小杯
        return 1 + beverage.cost();
    }
}
