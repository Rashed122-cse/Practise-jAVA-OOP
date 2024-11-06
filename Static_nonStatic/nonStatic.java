package Static_nonStatic;

class nonStatic {

    // Non-static variable
    int nonStaticCount = 0;

    // Instance initialization block
    {
        System.out.println("Instance initialization block executed.");
        nonStaticCount = 5;
    }
    public nonStatic() {
        nonStaticCount++;
    }
    // Non-static method
    public void displayNonStaticCount() {
        System.out.println("Non-static count: " + nonStaticCount);
    }
}
