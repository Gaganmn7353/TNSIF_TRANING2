package org.tnsif.acc.c2tc.poly;

class Addition {

    double add(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }

    int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    double add(double a, double b, double c) {
        System.out.println(a + b + c);
        return a + b + c;
    }

    int add(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }
} // End of Addition class

public class Polymorphism_2 {

    public static void main(String[] args) {

        Addition add1 = new Addition();

        add1.add(1.1, 2.1);
        add1.add(1.1, 2.1, 3);
        add1.add(1, 2, 3);
        add1.add(1, 2);
    }
}