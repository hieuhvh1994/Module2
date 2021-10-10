package Model;

public class Receipt {
    public Consumer consumer;
    private int oldIndicator;
    private int newIndicator;
    private int cost;

    public Receipt() {
    }

    public Receipt(Consumer consumer, int oldIndicator, int newIndicator) {
        this.consumer = consumer;
        this.oldIndicator = oldIndicator;
        this.newIndicator = newIndicator;
        this.cost = (newIndicator-oldIndicator)*750;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public int getOldIndicator() {
        return oldIndicator;
    }

    public void setOldIndicator(int oldIndicator) {
        this.oldIndicator = oldIndicator;
    }

    public int getNewIndicator() {
        return newIndicator;
    }

    public void setNewIndicator(int newIndicator) {
        this.newIndicator = newIndicator;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "consumer=" + consumer +
                ", oldIndicator=" + oldIndicator +
                ", newIndicator=" + newIndicator +
                ", cost=" + cost +
                '}';
    }
}
