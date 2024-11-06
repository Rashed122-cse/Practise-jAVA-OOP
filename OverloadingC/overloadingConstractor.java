package OverloadingC;

public class overloadingConstractor {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("rashed" , "male");
        Teacher teacher3 = new Teacher("rashed" , "male" , 9999);

        teacher1.displayInformation();

        teacher2.displayInformation();

        teacher3.displayInformation();
    }
}
