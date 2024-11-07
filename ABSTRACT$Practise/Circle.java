package ABSTRACT$Practise;

public class Circle extends Shape {
    private final double radious ;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radious,2);
    }
}
