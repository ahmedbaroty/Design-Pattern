package duck.behavior.display.impl;

import duck.behavior.display.DisplayBehavior;

public class NoDisplay implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("No Display");
    }
}
