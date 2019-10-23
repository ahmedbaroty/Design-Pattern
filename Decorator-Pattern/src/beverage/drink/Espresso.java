package beverage.drink;

import beverage.Beverage;

public class Espresso extends Beverage {
    String desc = "Espresso";

    @Override
    public int cost() {
        return 7;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
