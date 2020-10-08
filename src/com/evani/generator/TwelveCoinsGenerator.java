package com.evani.generator;

import com.evani.model.Coin;

import java.util.ArrayList;
import java.util.List;

public final class TwelveCoinsGenerator {

    public static List<Coin> generate(int i, int v) {
        List<Coin> coins = new ArrayList<>();

        for (int j = 0; j < 12; j++) {
            if (j == i) {
                coins.add(new Coin(j, true, v));
            } else {
                coins.add(new Coin(j, false, 0));
            }
        }
        return coins;
    }
}
