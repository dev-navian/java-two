package objects;

public class Account {

    // getting the number of Trades (total number of instances of the Trade class)
    public int getNumOfTrades() {
        return Trade.numOfTrades;
    }

    // setting the total number of Trades
    public void setNumOfTrades(int value) {
        Trade.numOfTrades = value;
    }
}
