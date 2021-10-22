package view;

import controller.MenuManager;

import java.io.IOException;
import java.util.Scanner;

public class StaffMenu {
    public static void enable() throws IOException {

        while (true) {
            System.out.println("------------------");
            System.out.println("STAFF MENU:");
            System.out.println("1. Show information of prisoners.");
            System.out.println("2. Search prisoner By ID.");
            System.out.println("3. Search prisoner By Name.");
            System.out.println("------------------------------------");
            System.out.println("4. Show information of wardens.");
            System.out.println("5. Search warden By ID.");
            System.out.println("6. Search warden By Name.");

            System.out.println("------------------------------------");
            System.out.println("7. Show information of cell rooms.");
            System.out.println("8. Search cell room by Room Number.");
            System.out.println("------------------------------------");
            System.out.println("9. Show information of camps.");
            System.out.println("10. Search camp by ID.");
            System.out.println("------------------------------------");
            System.out.println("11. Change password of this account.");
            System.out.println("------------------------------------");
            System.out.println("0. Exit!");
            System.out.println();
            System.out.println("Enter your choice: ");


            Scanner choiceScanner = new Scanner(System.in);
            int choice = choiceScanner.nextInt();

            switch (choice) {
                case 1:
                    MenuManager.showInfoOfPrisoners();
                    break;

                case 2:
                    MenuManager.searchPrisonerByID();
                    break;

                case 3:
                    MenuManager.searchPrisonerByName();
                    break;

                case 4:
                    MenuManager.showInfoOfWardens();
                    break;

                case 5:
                    MenuManager.searchWardenByID();
                    break;

                case 6:
                    MenuManager.searchWardenByName();
                    break;

                case 7:
                    MenuManager.showInfoOfCellRooms();
                    break;

                case 8:
                    MenuManager.searchCellRoomByNumber();
                    break;

                case 9:
                    MenuManager.showInfoOfCamps();
                    break;

                case 10:
                    MenuManager.searchCampByID();
                    break;

                case 11:
                    MenuManager.changePassword();
                    break;

                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
