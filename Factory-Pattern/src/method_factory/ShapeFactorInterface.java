package method_factory;

import shape.Shape;

public interface ShapeFactorInterface {
    Shape getShape(String type);
}
