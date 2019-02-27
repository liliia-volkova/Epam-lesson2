package ua.in.soul.epamprojects;

public class Variables {
    public static void main(String[] args) {

        int a = 3;
        int b = 9;
        print(a, b);

        a += b;
        print(a, b);

        b = a - b;
        print(a, b);

        a = a - b;
        print(a, b);
    }

    private static void print(int a, int b) {
        System.out.println(String.format("a = %d, b = %d", a, b));
    }
}

