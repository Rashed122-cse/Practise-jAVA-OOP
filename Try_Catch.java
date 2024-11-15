import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int first = sc.nextInt() ;
        int second = sc.nextInt();

        try {
           int[] a = new int[5] ;
           System.out.println(a[6]);
         int result = first / second ;
            System.out.println("result :" + result);
        }catch(Throwable exception ){
            System.out.println(" what is the problem");
        }
    }
}
