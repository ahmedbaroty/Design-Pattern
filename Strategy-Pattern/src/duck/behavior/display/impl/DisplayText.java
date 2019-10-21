package duck.behavior.display.impl;

import duck.behavior.display.DisplayBehavior;

public class DisplayText implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("This Is A Duck Displayed AS Text");
    }
}
