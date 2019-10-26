package abstract_factory.factory;

import shape.Shape;
import shape.rounded.RoundedRectangle;
import shape.rounded.RoundedSquare;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("Rounded Square")) {
            return new RoundedSquare();
        } else if (type.equalsIgnoreCase("Rounded Rectangle")) {
            return new RoundedRectangle();
        } else {
            System.out.println("Not supported");
            return null;
        }
    }
}
