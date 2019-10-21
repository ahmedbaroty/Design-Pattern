package duck.behavior.fly.impl;

import duck.behavior.fly.FlyBehavior;

public class SimpleFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Simple Fly");
    }
}
