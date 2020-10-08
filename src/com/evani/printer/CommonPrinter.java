package com.evani.printer;

import com.evani.model.Coin;

import java.util.List;

public final class CommonPrinter {

    public static void showCoins(List<Coin> coins) {
        int len = coins.size();

        for (Coin coin : coins) {
            System.out.print("" + coin.getValue() + " ");
        }
        System.out.print("\n");
    }
}
