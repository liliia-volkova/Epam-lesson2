package ua.in.soul.epamprojects;

import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {

        System.out.println("Введите значение депозита в гривнах");
        Scanner scd = new Scanner(System.in);
        String deposit = scd.next();

        System.out.println("Введите количество месяцев");
        Scanner scm = new Scanner(System.in);
        String months = scm.next();

        System.out.println("Введите значение годового процента, %");
        Scanner scp = new Scanner(System.in);
        String percent = scp.next();

        double p = Double.parseDouble(percent);
        double m = Double.parseDouble(months);
        double d = Double.parseDouble(deposit);

        double profit = (p * m * (d / 100));
        System.out.println("Ваша прибыль " + profit + " грн");
    }
}
