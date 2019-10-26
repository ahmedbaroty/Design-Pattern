package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.RoundedShapeFactory;
import abstract_factory.factory.SimpleShapeFactory;

public class FactoryProducer {

    public AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("Simple")){
            return new SimpleShapeFactory();
        }else if (type.equalsIgnoreCase("Rounded")){
            return new RoundedShapeFactory();
        }else{
            System.out.println("Not Supported");
            return null;
        }
    }
}
