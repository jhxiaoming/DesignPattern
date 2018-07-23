package mydemo;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public float cost() {
        return 1;
    }
}
