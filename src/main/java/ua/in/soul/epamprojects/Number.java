package ua.in.soul.epamprojects;

public class Number {
    public static void main(String[] args) {

        int number = 753;
        System.out.println(number);

        int number2 = 0;
        while (number != 0) {
            number2 = number2 * 10 + number % 10;
            number /= 10;
        }
        System.out.println(number2);
    }
}
