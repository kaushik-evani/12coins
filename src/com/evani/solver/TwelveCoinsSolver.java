package com.evani.solver;

import com.evani.model.Coin;

import java.util.ArrayList;
import java.util.List;

public final class TwelveCoinsSolver {

    public static Coin solve(List<Coin> coins) {
        List<Coin> set0_3 = coins.subList(0, 4);
        List<Coin> set4_7 = coins.subList(4, 8);
        List<Coin> set8_11 = coins.subList(8, 12);

        int weighing1 = weighCoins(set0_3, set4_7);

        if (weighing1 != 0) {

            List<Coin> set0_1_2_4 = new ArrayList<>(set0_3);
            set0_1_2_4.set(3, coins.get(4));

            List<Coin> set8_9_10_3 = new ArrayList<>(set8_11);
            set8_9_10_3.set(3, coins.get(3));

            int weighing2 = weighCoins(set0_1_2_4, set8_9_10_3);

            if (weighing2 != 0) {

                if (weighing1 == weighing2) {
                    Coin coin0 = coins.get(0);
                    Coin coin1 = coins.get(1);

                    int weighing3 = weighCoins(coin0, coin1);

                    if (weighing3 != 0) {
                        if (weighing1 == weighing3) {
                            return coin0;
                        } else {
                            return coin1;
                        }
                    } else {
                        return coins.get(2);
                    }

                } else {
                    Coin coin3 = coins.get(3);
                    Coin coin8 = coins.get(8);

                    int weighing3 = weighCoins(coin3, coin8);

                    if (weighing3 != 0) {
                        return coin3;
                    } else {
                        return coins.get(4);
                    }
                }

            } else {
                Coin coin5 = coins.get(5);
                Coin coin6 = coins.get(6);

                int weighing3 = weighCoins(coin5, coin6);

                if (weighing3 != 0) {
                    if (weighing1 == weighing3) {
                        return coin6;
                    } else {
                        return coin5;
                    }
                } else {
                    return coins.get(7);
                }
            }

        } else {
            List<Coin> set0_3_8 = new ArrayList<>(set0_3);
            set0_3_8.add(set8_11.get(0));

            List<Coin> set4_7_9 = new ArrayList<>(set4_7);
            set4_7_9.add(set8_11.get(1));

            int weighing2 = weighCoins(set0_3_8, set4_7_9);

            if (weighing2 != 0) {
                Coin coin8 = coins.get(8);
                Coin coin9 = coins.get(9);
                Coin coin0 = coins.get(0);

                int weighing3 = weighCoins(coin8, coin0);

                if (weighing3 != 0) {
                    return coin8;
                } else {
                    return coin9;
                }

            } else {
                Coin coin10 = coins.get(10);
                Coin coin0 = coins.get(0);

                int weighing3 = weighCoins(coin10, coin0);

                if (weighing3 != 0) {
                    return coin10;
                } else {
                    return coins.get(11);
                }
            }
        }
    }

    public static int weighCoins(List<Coin> set1, List<Coin> set2) {

        int set1Sum = coinSum(set1);
        int set2Sum = coinSum(set2);

        if (set1Sum < set2Sum) {
            return -1;
        } else if (set1Sum > set2Sum) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int weighCoins(Coin coin1, Coin coin2) {

        int set1Sum = coin1.getValue();
        int set2Sum = coin2.getValue();

        if (set1Sum < set2Sum) {
            return -1;
        } else if (set1Sum > set2Sum) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int coinSum(List<Coin> coins) {
        int sum = 0;

        for (Coin coin : coins) {
            sum += coin.getValue();
        }

        return sum;
    }
}
