package Coins;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinCounter {

    private final List<Coins> coinsList;

    /**
     * Only coins from coinsList variable in this class are considered during calculations
     * @param number total change value
     * @return minimum count of coins needed to give the change
     */
    public int minimumGiveTheChangeCoins(int number){
        if(number < 0) throw new IllegalArgumentException("Change cannot be negative");

        int count = 0;

        for (Coins coin: this.coinsList) {
            if(number / coin.getValue() > 0){
                count += (number / coin.getValue());
                number %= coin.getValue();
            }
        }
        return count;
    }

    /**
     * Only coins from coinsList variable in this class are considered during calculations
     * @param number total change value
     * @return Map of what coins and how many of them are needed to give the change
     */
    public Map<Coins, Integer> giveTheChange(int number){
        if(number <= 0) throw new IllegalArgumentException("Change cannot be negative");

        Map<Coins, Integer> coinsMap = new HashMap<>();

        for(Coins coin : this.coinsList){
            if(number / coin.getValue() > 0){
                coinsMap.put(coin, (number/coin.getValue()));
                number %= coin.getValue();
            }
        }
        return coinsMap;
    }

    public int recountNominal(double nominal){
        return (int)(nominal * 100);
    }

    public CoinCounter(List<Coins> coinsList) {
        this.coinsList = coinsList;
    }

}
