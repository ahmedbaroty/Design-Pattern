import abstract_factory.FactoryProducer;
import abstract_factory.factory.AbstractFactory;
import method_factory.ShapeFactory;
import shape.Shape;

public class Main {

    public static void main(String[] args) {
        System.out.println("Method Factory");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        System.out.println("Abstract Factory");

        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory simpleFactory = factoryProducer.getFactory("Simple");
        Shape simple1 = simpleFactory.getShape("Simple Circle");
        simple1.draw();

        Shape simple2 = simpleFactory.getShape("Simple Square");
        simple2.draw();

        AbstractFactory roundedFactory = factoryProducer.getFactory("Rounded");
        Shape rounded1 = roundedFactory.getShape("Rounded Square");
        rounded1.draw();

        Shape rounded2 = roundedFactory.getShape("Rounded Rectangle");
        rounded2.draw();





    }
}
