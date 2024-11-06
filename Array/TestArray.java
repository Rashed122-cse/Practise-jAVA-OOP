package Array;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrayoperation opr = new Arrayoperation(numbers);
        Arrayoperation.Calculate calculate = opr.new Calculate();

        System.out.println("Mean: " + calculate.mean());
        System.out.println("Median: " + calculate.median());
    }
}
