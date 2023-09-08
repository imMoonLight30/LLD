package DesignPattern.Factory;

public class ShapeFactory {
    Shape obj =null;

    public Shape getShape(String name){
        switch(name){
            case "circle" :
                return new Circle();
            case "squre" :
                return new Squre();
        }
        return obj;
    }
}
