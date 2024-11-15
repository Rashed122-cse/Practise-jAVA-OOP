package Challenge;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("car is getting service....");
    }

}
