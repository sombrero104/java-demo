package main.java;

public class Unsigned {

    public static void main(String[] args) {
        int a = Integer.parseUnsignedInt("4294967295");
        System.out.println(a);
        System.out.println(Integer.toUnsignedString(a));

        int b = 2147483647;

        long c = Long.parseUnsignedLong("18446744073709551615");
        System.out.println(c);
        System.out.println(Long.toUnsignedString(c));
    }
}
