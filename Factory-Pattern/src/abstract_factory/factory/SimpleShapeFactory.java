package abstract_factory.factory;

import shape.Shape;
import shape.simple.Circle;
import shape.simple.Square;

public class SimpleShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String type) {

        if (type.equalsIgnoreCase("Simple Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Simple Square")) {
            return new Square();
        } else {
            System.out.println("Not supported");
            return null;
        }
    }


}
