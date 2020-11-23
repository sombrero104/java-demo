package main.java;

public class Bitwise {

    public static void main(String[] args) {
        /**
         * Bitwise complement (~)
         */
        byte b = ~12; // ~00001100
        System.out.println(b); // -13
        System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')); // 11110011

        byte flags = 12; // 00001100
        byte f = 8; // 00001000
        flags = (byte) (flags & ~f); // 00001100 & ~00001000
        System.out.println(String.format("%8s", Integer.toBinaryString(flags & 0xFF)).replace(' ', '0')); // 00000100
    }

}
