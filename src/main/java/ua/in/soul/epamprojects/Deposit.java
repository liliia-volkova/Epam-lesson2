package ua.in.soul.epamprojects;

import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {

        System.out.println("Введите значение депозита в гривнах");
        Scanner scd = new Scanner(System.in);
        String depositStr = scd.next();

        System.out.println("Введите количество месяцев");
        Scanner scm = new Scanner(System.in);
        String monthsStr = scm.next();

        System.out.println("Введите значение годового процента, %");
        Scanner scp = new Scanner(System.in);
        String percentStr = scp.next();

        double yearlyPercentage = Double.parseDouble(percentStr);
        double deposit = Double.parseDouble(depositStr);

        int months = Integer.parseInt(monthsStr);
        double monthlyPercentage = yearlyPercentage / 12;

        double currentAmount = deposit;

        for (int i = 0; i < months; i++) {
            double profit = currentAmount * (monthlyPercentage / 100);
            currentAmount += profit;

            System.out.println(String.format("Ваша прибыль %.2f грн", profit));
            System.out.println(String.format("Итого на счету %.2f грн. в месяце №%d", currentAmount, i + 1));
        }
    }
}
