package beverage.addon;

import beverage.Beverage;

public abstract class AddOnDecorator extends Beverage{
    public int cost;
    public String desc;
    public Beverage beverage;
    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
