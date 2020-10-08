package com.evani;

import com.evani.generator.TwelveCoinsGenerator;
import com.evani.model.Coin;
import com.evani.printer.CommonPrinter;
import com.evani.solver.TwelveCoinsSolver;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the 12 coins puzzle solver!");
//        System.out.printf("Enter the index at which you want the fake coin to be placed (0-11) - ");
//        Scanner in = new Scanner(System.in);
//        int index = in.nextInt();
//        if (index < 0 || index > 11) {
//            System.out.println("Select index between 0 and 11. Try again.");
//            return;
//        }
//        System.out.println("The index you selected is " + index);
//
//        System.out.println("Select if the fake coin is lighter or heavier");
//        System.out.printf("Enter -1 for lighter and 1 for heavier - ");
//        int value = in.nextInt();
//        if (!(value == -1 || value == 1)) {
//            System.out.println("Only -1 and 1 allowed. Try again.");
//            return;
//        }
//        System.out.println("The value you selected is " + value);
//        List<Coin> coins = TwelveCoinsGenerator.generate(index, value);
//
//        CommonPrinter.showCoins(coins);
//
//        Coin fakeCoin = TwelveCoinsSolver.solve(coins);
//
//        System.out.println("The fake coin is at index- " + fakeCoin.getIndex());
//        System.out.println(fakeCoin);

        for (int i = 0; i < 12; i++) {
            System.out.println("################################");
            int value = 1;
            System.out.println("Index - " + i + ", value - " + value);
            List<Coin> coins = TwelveCoinsGenerator.generate(i, value);
            Coin fakeCoin = TwelveCoinsSolver.solve(coins);
            System.out.println("The fake coin is at index- " + fakeCoin.getIndex());

            value = -1;
            System.out.println("Index - " + i + ", value - " + value);
            coins = TwelveCoinsGenerator.generate(i, value);
            fakeCoin = TwelveCoinsSolver.solve(coins);
            System.out.println("The fake coin is at index- " + fakeCoin.getIndex());
        }

    }
}
