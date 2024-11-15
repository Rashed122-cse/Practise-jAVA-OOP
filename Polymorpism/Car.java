package Polymorpism;

public class Car implements Vehical {

    public int numDOor(){
        return 5 ;

    }

    @Override
    public void start() {
        System.out.println("broom ....");
    }
}
