package mydemo;

public class CoffeeHouse {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();  // darkroast 1
        beverage.setSize("venti");
//        beverage = new Milk(beverage);
        beverage = new Milk(beverage); //mil 3

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());  //4

    }
}
