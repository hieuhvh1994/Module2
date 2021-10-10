package View;

import Controller.ElectricityBillManager;
import Model.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElectricityBillManager electricityBillManager = new ElectricityBillManager();

        int choice = -1;

        while (choice != 0) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("MENU: ");
            System.out.println("1. Add New Consumer. ");
            System.out.println("2. Add New Receipt. ");
            System.out.println("3. Show Consumer List. ");
            System.out.println("4. Show Receipt List. ");
            System.out.println("5. Show Consumer Information. ");
            System.out.println("6. Show Receipt Information. ");
            System.out.println("7. Delete a Consumer. ");
            System.out.println("8. Delete a Receipt. ");
            System.out.println("0. Exit. ");
            System.out.println("\n");
            System.out.println("Enter your choice: ");

            choice = sc1.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter new name of the consumer: ");
                    String newName = sc2.nextLine();

                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter new address of the consumer: ");
                    String newAddress = sc3.nextLine();

                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Enter new code of the consumer: ");
                    int newCode = sc4.nextInt();

                    electricityBillManager.addConsumer(newName, newAddress, newCode);

                    System.out.println("Successful added new Consumer!!");
                    break;

                case 2:

                    if (electricityBillManager.getConsumerList().size() == 0) {
                        System.out.println("There is no consumer to add new receipt!!");
                    } else {
                        Scanner sc5 = new Scanner(System.in);
                        electricityBillManager.showConsumerList();
                        System.out.println("Enter the consumer to add new receipt: ");
                        int consumerNum = sc5.nextInt();

                        Scanner sc6 = new Scanner(System.in);
                        System.out.println("Enter electricity old indicator: ");
                        int newOldIndicator = sc6.nextInt();

                        Scanner sc7 = new Scanner(System.in);
                        System.out.println("Enter electricity new indicator: ");
                        int newNewIndicator = sc7.nextInt();

                        electricityBillManager.addReceipt(electricityBillManager.getConsumerList().get(consumerNum-1), newOldIndicator, newNewIndicator);
                        System.out.println("Successful added new receipt!!");
                    }
                    break;

                case 3:
                    electricityBillManager.showConsumerList();
                    break;

                case 4:
                    electricityBillManager.showReceiptList();
                    break;

                case 5:
                    electricityBillManager.showConsumerList();
                    Scanner sc8 = new Scanner(System.in);

                    System.out.println("Enter the customer to show information: ");
                    int selectConsumer = sc8.nextInt();

                    System.out.println(electricityBillManager.getConsumerList().get(selectConsumer-1).toString());
                    break;

                case 6:
                    electricityBillManager.showReceiptList();
                    Scanner sc9 = new Scanner(System.in);

                    System.out.println("Enter the receipt to show information: ");
                    int selectReceipt = sc9.nextInt();

                    System.out.println(electricityBillManager.getReceiptList().get(selectReceipt-1).toString());
                    break;

                case 7:
                    electricityBillManager.showConsumerList();
                    Scanner sc10 = new Scanner(System.in);
                    int selectConsumerDelete = sc10.nextInt();

                    electricityBillManager.deleteConsumer(electricityBillManager.getConsumerList().get(selectConsumerDelete-1));

                    System.out.println("Successful deleted consumer!!");

                    break;

                case 8:
                    electricityBillManager.showReceiptList();
                    Scanner sc11 = new Scanner(System.in);
                    int selectReceiptDelete = sc11.nextInt();

                    electricityBillManager.deleteConsumer(electricityBillManager.getConsumerList().get(selectReceiptDelete-1));

                    System.out.println("Successful deleted receipt!!");

                    break;



            }


        }


    }
}
