package Controller;

import Model.Consumer;
import Model.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ElectricityBillManager {
    private List<Consumer> consumerList = new ArrayList<>();
    private List<Receipt> receiptList = new ArrayList<>();

    public ElectricityBillManager() {
    }

    public ElectricityBillManager(List<Consumer> consumerList, List<Receipt> receiptList) {
        this.consumerList = consumerList;
        this.receiptList = receiptList;
    }

    public List<Consumer> getConsumerList() {
        return consumerList;
    }

    public void setConsumerList(List<Consumer> consumerList) {
        this.consumerList = consumerList;
    }

    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    @Override
    public String toString() {
        return "ElectricityBillManager{" +
                "consumerList=" + consumerList +
                ", receiptList=" + receiptList +
                '}';
    }

    public void addConsumer(String name, String address, int code) {
        Consumer consumer = new Consumer(name, address, code);
        consumerList.add(consumer);
    }

    public void addReceipt(Consumer consumer, int oldIndicator, int newIndicator) {
        Receipt receipt = new Receipt(consumer, oldIndicator, newIndicator);
        receiptList.add(receipt);
    }

    public void deleteConsumer(Consumer consumer){
        consumerList.remove(consumer);

    }

    public void deleteReceipt(Receipt receipt) {
        receiptList.remove(receipt);
    }


    public String getConsumerInfo(Consumer consumer) {
        int totalCost = 0;
        for (int i=0; i<receiptList.size(); i++) {
            if (receiptList.get(i).getConsumer().getName().equals(consumer.getName())) {
                totalCost += receiptList.get(i).getCost();
            }

        }

        System.out.println("Cost: " + totalCost);
        return consumer.toString();
    }

    public void showConsumerList() {
        for (int i=0; i<consumerList.size(); i++) {
            System.out.println(i+1 +". " + consumerList.get(i).toString());
        }
    }

    public String getReceiptInfo(Receipt receipt) {
        return receipt.toString();

    }

    public void showReceiptList() {
        for (int i=0; i<receiptList.size(); i++) {
            System.out.println(i+1 + " " +receiptList.get(i).toString());
        }
    }

    public void showReceiptsOfConsumer(Consumer consumer, List<Receipt> receiptList) {
        for (int i=0; i<receiptList.size(); i++) {
            if (receiptList.get(i).getConsumer().getName().equals(consumer.getName())) {
                System.out.println(receiptList.get(i).toString());
            }

        }
    }
}
