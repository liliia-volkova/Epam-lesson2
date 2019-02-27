package ua.in.soul.epamprojects;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        double kg = 0.4536;
        double f;

        System.out.println("Введите значение веса в фунтах");
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        f = Double.parseDouble(w);

        f *= kg;
        System.out.println(f + " кг");

        int k = (int) f;
        System.out.print(k + " кг ");

        double g = (f % k) * 1000;
        int gr = (int) g;
        System.out.println(gr + " г");
    }
}
