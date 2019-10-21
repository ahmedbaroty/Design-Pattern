package duck;

import duck.behavior.display.DisplayBehavior;
import duck.behavior.fly.FlyBehavior;

public class Duck {

    DisplayBehavior displayBehavior;
    FlyBehavior flyBehavior;

    public Duck(DisplayBehavior displayBehavior, FlyBehavior flyBehavior) {
        this.displayBehavior = displayBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void display(){
        displayBehavior.display();
    }

    public void fly(){
        flyBehavior.fly();
    }
}
