package ua.in.soul.epamprojects;

public class Number {
    public static void main(String[] args) {

        int number = 951;
        System.out.println("Number 1 = " + number);

        int number2 = 0;
        int temp = number;
        while (temp != 0) {
            number2 = number2 * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Number 2 = " + number2);
        int result = number - number2;
        System.out.println(number + " - " + number2 + " = " + result);
    }
}
