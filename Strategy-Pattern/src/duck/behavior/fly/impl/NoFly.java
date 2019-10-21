package duck.behavior.fly.impl;

import duck.behavior.fly.FlyBehavior;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
