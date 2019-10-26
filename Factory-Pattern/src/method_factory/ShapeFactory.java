package method_factory;

import shape.Shape;
import shape.simple.Circle;
import shape.simple.Square;

public class ShapeFactory implements ShapeFactorInterface{

    @Override
    public Shape getShape(String type) {
        if (type.equals("Circle")) {
            return new Circle();
        } else if (type.equals("Square")) {
            return new Square();
        } else {
            System.out.println("\"" + type + "\" : Not Support Type");
            return null;
        }
    }
}
