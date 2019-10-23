package beverage.addon.flavor;

import beverage.Beverage;
import beverage.addon.AddOnDecorator;

public class Chocolate extends AddOnDecorator {


    public Chocolate(Beverage beverage) {
       super(beverage);
       this.cost = 90;
       this.desc = "Chocolate";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " " + desc;
    }
}
