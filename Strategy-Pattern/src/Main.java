import duck.Duck;
import duck.behavior.display.impl.DisplayText;
import duck.behavior.display.impl.NoDisplay;
import duck.behavior.fly.impl.NoFly;
import duck.behavior.fly.impl.SimpleFly;

public class Main {

    public static void main(String[] args) {

        // Duck NO NO
        Duck duck1 = new Duck(new NoDisplay() , new NoFly());
        duck1.display();
        duck1.fly();

        // Duck NO Simple
        Duck duck2 = new Duck(new NoDisplay() , new SimpleFly());
        duck2.display();
        duck2.fly();

        // Duck text NO
        Duck duck3 = new Duck(new DisplayText() , new NoFly());
        duck3.display();
        duck3.fly();

        // Duck text simple
        Duck duck4 = new Duck(new DisplayText() , new SimpleFly());
        duck4.display();
        duck4.fly();
    }
}
