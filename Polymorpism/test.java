package Polymorpism;

import ABSTRACT$Practise1.Eagle;

public class test {
    public static void main(String[] args) {

        Car c = new Car() ;
      //  Vehical v = new Vehical() ;
        Plane p = new Plane();

        Vehical ve = new Car() ;
       //  Car ca = (Car) new Vehical();

       // Object ref = new Vehical() ;
        Object re = new Car() ;

        //castTest(v);
        castTest(c);
        castTest(p);
        
    }
    public static void castTest(Vehical vh){

       // Car ca = (Car) vh;
        //ca.start();
        //ca.numDOor() ;
        vh.start();
    }
}
