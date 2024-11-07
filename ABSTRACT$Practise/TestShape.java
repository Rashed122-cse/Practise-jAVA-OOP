package ABSTRACT$Practise;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {

        //Shape shape = new Shape ();
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle(sc.nextDouble());
        Square squqre = new Square(sc.nextDouble());

        System.out.printf("area of Circle %f\n", circle.calculateArea());
        System.out.printf("area of Square %f\n", squqre.calculateArea());

    }
}
