package ua.in.soul.epamprojects;

public class Variables {
    public static void main(String[] args) {

        int a = 3;
        int b = 9;
        System.out.println("a = " + a + ", " + "b = " + b);

        a += b;
        System.out.println("a = " + a + ", " + "b = " + b);

        b = a - b;
        System.out.println("a = " + a + ", " + "b = " + b);

        a = a - b;
        System.out.println("a = " + a + ", " + "b = " + b);
       }
    }

