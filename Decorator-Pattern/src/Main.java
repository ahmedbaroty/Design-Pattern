import beverage.Beverage;
import beverage.addon.flavor.Chocolate;
import beverage.addon.flavor.Creamable;
import beverage.drink.Espresso;

public class Main {

    public static void main(String[] args) {

        Beverage cream_chocolate_espresso = new Creamable(new Chocolate(new Espresso()));
        System.out.println(cream_chocolate_espresso.getDescription());
        System.out.println(cream_chocolate_espresso.cost());

        Beverage chocolate_cream_espresso = new Chocolate(new Creamable(new Espresso()));
        System.out.println(chocolate_cream_espresso.getDescription());
        System.out.println(chocolate_cream_espresso.cost());

        Beverage cream_espresso = new Creamable(new Espresso());
        System.out.println(cream_espresso.getDescription());
        System.out.println(cream_espresso.cost());

        Beverage chocolate_espresso = new Chocolate(new Espresso());
        System.out.println(chocolate_espresso.getDescription());
        System.out.println(chocolate_espresso.cost());

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
    }
}
