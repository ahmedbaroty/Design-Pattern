package beverage.addon.flavor;

import beverage.Beverage;
import beverage.addon.AddOnDecorator;

public class Creamable extends AddOnDecorator {

    public Creamable(Beverage beverage) {
        super(beverage);
        this.cost = 17;
        this.desc = "Creamble";
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
