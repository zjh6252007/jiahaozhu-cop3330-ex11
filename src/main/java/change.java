/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */
import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        double changeRate;
        double money;
        double dollars;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many euros are you exchanging:");
        money = scan.nextDouble();
        System.out.println("What is the exchange rate?:");
        changeRate = scan.nextDouble();
        dollars = changeRate * money;
        System.out.println(Math.round(money) + "euros at an exchange rate of " + changeRate + " is\n" + round(dollars) + " U.S. dollars.");
    }
    public static double round(double cash)
    {
        double roundup = Math.round(cash * 100.0)/100.0;
        return roundup;
    }
}

