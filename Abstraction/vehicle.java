package Abstraction;

public abstract class  vehicle {
    private int noOfTire ;

    public vehicle(int noOfTire) {
        this.noOfTire = noOfTire;
    }

    public int getNoOfTire() {
        return noOfTire;
    }

    public void setNoOfTire(int noOfTire) {
        this.noOfTire = noOfTire;
    }
    public void commuite(){
        System.out.println("going ....");
    }

}
