package Abstraction;

public abstract class  vehicle implements Transport {
    private int noOfTire ;

    public abstract void makeStartSount();

    @Override
    public void getSetGo() {
        System.out.println("going to place");
    }

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
