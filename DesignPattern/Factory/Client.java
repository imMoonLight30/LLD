package DesignPattern.Factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory sf= new ShapeFactory();
        sf.getShape("circle").draw();
        sf.getShape("squre").draw();
    }
}
