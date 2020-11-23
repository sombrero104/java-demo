package main.java;

public class ShiftOperator {
    /**
     *
     * 10 << 1                         // 0b00001010 << 1 = 00010100 = 20 = 10*2
     * 7 << 3                          // 0b00000111 << 3 = 00111000 = 56 = 7*8
     * -1 << 2                         // 0xFFFFFFFF << 2 = 0xFFFFFFFC = -4 = -1*4
     *                                 // 0xFFFF_FFFC == 0b1111_1111_1111_1111_1111_1111_1111_1100
     *
     *
     */

    public static void main(String[] args) {
        System.out.println(String.format("%8s", Integer.toBinaryString((10 << 1) & 0xFF)).replace(' ', '0')); // 00010100
        System.out.println(String.format("%8s", Integer.toBinaryString((7 << 3) & 0xFF)).replace(' ', '0')); // 00111000
        System.out.println(String.format("%8s", Integer.toBinaryString((-1 << 2) & 0xFF)).replace(' ', '0')); //

        System.out.println(String.format("%8s", Integer.toBinaryString(0xFFFFFFFF & 0xFF)).replace(' ', '0'));
    }
}


