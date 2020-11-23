package main.java;

public class InstanceOf {

    static class A {}
    static class B extends A {}

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(b instanceof A);
    }

}
