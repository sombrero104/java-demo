package main.java;

public class CastingTest {

    public static void main(String[] args) {
        /*byte a = 12;
        short b = 325;
        b = a;
        a = (byte)b;

        System.out.println(a);*/

        short a = 32767;
        int b = 32768 + 32768;
        a = (short) b;
        System.out.println("# a: " + a);

        byte b1 = 127, b2 = 1;
        byte sum = (byte) (b1 + b2);

        byte b3 = -128, b4 = 5;
        byte sum2 = (byte) (b3 - b4);

        System.out.println("# sum: " + sum);
        System.out.println("# sum2: " + sum2);


        int i1 = 2147483647, i2 = 1;
        int sum3 = i1 + i2;

        System.out.println("# sum3: " + sum3);
    }

}
