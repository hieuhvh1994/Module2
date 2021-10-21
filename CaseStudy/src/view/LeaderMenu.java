package view;

import authentication.MenuManager;

import java.io.IOException;
import java.util.Scanner;

public class LeaderMenu {
    public static void enable() throws IOException {

        while (true) {
            System.out.println("------------------");
            System.out.println("LEADER MENU:");
            System.out.println("1. Show information of prisoners.");
            System.out.println("2. Add new prisoner.");
            System.out.println("3. Update information of prisoner.");
            System.out.println("4. Delete prisoner.");
            System.out.println("------------------------------------");
            System.out.println("5. Show information of wardens.");
            System.out.println("6. Add new warden.");
            System.out.println("7. Update information of warden.");
            System.out.println("8. Delete warden.");
            System.out.println("------------------------------------");
            System.out.println("9. Show information of cell rooms.");
            System.out.println("10. Add new cell room.");
            System.out.println("11. Update information of cell room.");
            System.out.println("12. Delete cell room.");
            System.out.println("13. Add prisoner to cell room.");
            System.out.println("14. Remove prisoner of cell room.");
            System.out.println("------------------------------------");
            System.out.println("15. Show information of camps.");
            System.out.println("16. Add new camp.");
            System.out.println("17. Update information of camp.");
            System.out.println("18. Delete camp.");
            System.out.println("19. Add cell room to camp.");
            System.out.println("20. Remove cell room of camp.");
            System.out.println("------------------------------------");
            System.out.println("21. Change password of this account.");
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
                    MenuManager.addNewPrisoner();
                    break;

                case 3:
                    MenuManager.updateInfoPrisoner();
                    break;

                case 4:
                    MenuManager.deletePrisoner();
                    break;

                case 5:
                    MenuManager.showInfoOfWardens();
                    break;

                case 6:
                    MenuManager.addNewWarden();
                    break;

                case 7:
                    MenuManager.updateInfoWarden();
                    break;

                case 8:
                    MenuManager.deleteWarden();
                    break;

                case 9:
                    MenuManager.showInfoOfCellRooms();
                    break;

                case 10:
                    MenuManager.addNewCellRoom();
                    break;

                case 11:
                    MenuManager.updateInfoCellRoom();
                    break;

                case 12:
                    MenuManager.deleteCellRoom();
                    break;

                case 13:
                    MenuManager.addPrisonerToCellRoom();
                    break;

                case 14:
                    MenuManager.removePrisonerFromCellRoom();

                case 15:
                    MenuManager.showInfoOfCamps();
                    break;

                case 16:
                    MenuManager.addNewCamp();
                    break;

                case 17:
                    MenuManager.updateInfoCamp();
                    break;

                case 18:
                    MenuManager.deleteCamp();
                    break;

                case 19:
                    MenuManager.addCellRoomToCamp();
                    break;

                case 20:
                    MenuManager.removeCellRoomFromCamp();

                case 21:
                    MenuManager.changePassword();
                    break;

                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
