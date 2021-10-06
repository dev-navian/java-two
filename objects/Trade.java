package objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Trade {
    String id;
    String symbol;
    int quantity;
    double price;

    static int numOfTrades = 0;

    // instance block for determining the total number of instantiated objects
    {
        numOfTrades += 1;
    }

    // constructor
    public Trade (String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    // overloaded constructor
    public Trade (String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    // toString method
    public String toString() {
        System.out.println("Trade: ID: " + id + " Symbol: " + symbol + " Quantity: " + quantity + " Price: " + price);
        return null;
    }

    // get price
    public double getPrice() {
        return this.price;
    }

    // get quantity
    public int getQuantity() { return this.quantity; }

    // set price
    public void setPrice(double definedPrice) {
        if (definedPrice < 0) {
            throw new IllegalArgumentException("Please enter a positive value");
        }

        this.price = definedPrice;
    }

    // set quantity
    public void setQuantity(int quantity) { this.quantity = quantity; }

//    public abstract double calcDividend();

    // main method
    public static void main(String[] args) {
        List<Trade> trades = new ArrayList<>();

        Trade tradeOne = new Trade("AAB-1", "22334A", 18, 35.4);
        Trade tradeTwo = new Trade("AAB-2", "22334B", 12, 56.2);
        Trade tradeThree = new Trade("AAB-3", "22334C", 22, 41.4);
        Trade tradeFour = new Trade("AAB-4", "22334D", 11, 22.0);

        trades.add(tradeOne);
        trades.add(tradeTwo);
        trades.add(tradeThree);
        trades.add(tradeFour);

        //////// sorting trades by volume
        for(Trade trade : trades) {
            System.out.println(trade.getQuantity());
        }

        // sorting method
        Collections.sort(trades, new TradeSortByVolume());
        System.out.println("======================");

        for(Trade trade : trades) {
            System.out.println(trade.getQuantity());
        }

        System.out.println("***********************");

        //////// sorting trades by value
        for(Trade trade : trades) {
            System.out.println(trade.getPrice());
        }

        // sorting method
        Collections.sort(trades, new TradeSortByValue());
        System.out.println("======================");

        for(Trade trade : trades) {
            System.out.println(trade.getPrice());
        }
    }

    // comparator class for sorting trades by volume
    static class TradeSortByVolume implements Comparator<Trade> {
        @Override
        public int compare(Trade tradeOne, Trade tradeTwo) {
            return (int) (tradeOne.getQuantity() - tradeTwo.getQuantity());
        }
    }

    // comparator class for sorting trades by value
    static class TradeSortByValue implements Comparator<Trade> {
        @Override
        public int compare(Trade tradeOne, Trade tradeTwo) {
            return (int) (tradeOne.getPrice() - tradeTwo.getPrice());
        }
    }

}
