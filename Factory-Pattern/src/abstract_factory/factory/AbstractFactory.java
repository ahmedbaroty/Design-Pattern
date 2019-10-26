package abstract_factory.factory;

import shape.Shape;

public interface AbstractFactory {
    Shape getShape(String type);
}