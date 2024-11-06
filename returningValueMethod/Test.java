package returningValueMethod;

public class Test {
    public static void main(String[] args) {
        returnValue obj = new returnValue();

       int result = obj.square(5);
        System.out.println("Square of 5: " + result);

        returnValue obj1 = new returnValue() ; 
        System.out.println(" Square of 5 " + obj1.square(5));
    
       
    }
}
