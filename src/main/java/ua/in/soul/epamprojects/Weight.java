package ua.in.soul.epamprojects;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        double poundToKilogramRate = 0.4536;
        double pounds;

        System.out.println("Введите значение веса в фунтах");
        Scanner scanner = new Scanner(System.in);
        String weight = scanner.next();

        pounds = Double.parseDouble(weight);

        pounds *= poundToKilogramRate;
        System.out.println(pounds + " кг");

        int k = (int) pounds;
        System.out.print(k + " кг ");

        double g = (pounds % k) * 1000;
        int gr = (int) g;
        System.out.println(gr + " г");
    }
}
