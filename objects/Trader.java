package objects;

public class Trader {
    private String name;
    private int traderAccount;
    Account oldAccount = new Account();

    Trader(String name) {
        this.name = name;
    }

    public double addTrade(Trade trade) {
        double tradeValue = trade.getPrice() * trade.getQuantity();
        traderAccount = (int) tradeValue + oldAccount.getNumOfTrades();

        return traderAccount;
    }

}
