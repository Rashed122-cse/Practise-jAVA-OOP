package Abstraction;

public class Car extends vehicle {

    public int noOfDoor;

    @Override
    public void makeStartSount() {
        System.out.println("vroom ......");
    }

    public Car(int noOfTire) {
        super(noOfTire);
    }
}
