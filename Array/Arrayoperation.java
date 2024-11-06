package Array;

import java.util.Arrays;

public class Arrayoperation {
    private int[] number;

    // Constructor to initialize the array
    public Arrayoperation(int[] numbers) {
        this.number = numbers;
    }

    public class Calculate {

        // Method to calculate the mean
        double mean() {
            double sum = 0;
            for (int num : number) {
                sum += num;
            }
            return sum / number.length;
        }

        // Method to calculate the median
        double median() {
            Arrays.sort(number);
            if (number.length % 2 == 0) {
                return (number[number.length / 2 - 1] + number[number.length / 2]) / 2.0;
            } else {
                return number[number.length / 2];
            }
        }
    }
}
