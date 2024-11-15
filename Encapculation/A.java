package Encapculation;

import java.util.Scanner;
class A {

    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int x) {
        value = x;
    }
}
    class B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            A r = new A();
            r.setValue(sc.nextInt());
            System.out.println(r.getValue());
        }

    }