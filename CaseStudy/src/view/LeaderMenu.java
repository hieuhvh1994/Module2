package view;

import controller.MenuManager;

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
            System.out.println("5. Search prisoner By ID.");
            System.out.println("6. Search prisoner By Name.");
            System.out.println("------------------------------------");
            System.out.println("7. Show information of wardens.");
            System.out.println("8. Add new warden.");
            System.out.println("9. Update information of warden.");
            System.out.println("10. Delete warden.");
            System.out.println("11. Search warden By ID.");
            System.out.println("12. Search warden By Name.");

            System.out.println("------------------------------------");
            System.out.println("13. Show information of cell rooms.");
            System.out.println("14. Add new cell room.");
            System.out.println("15. Update information of cell room.");
            System.out.println("16. Delete cell room.");
            System.out.println("17. Add prisoner to cell room.");
            System.out.println("18. Remove prisoner of cell room.");
            System.out.println("19. Search cell room by Room Number.");
            System.out.println("------------------------------------");
            System.out.println("20. Show information of camps.");
            System.out.println("21. Add new camp.");
            System.out.println("22. Update information of camp.");
            System.out.println("23. Delete camp.");
            System.out.println("24. Add cell room to camp.");
            System.out.println("25. Remove cell room of camp.");
            System.out.println("26. Set warden for the camp.");
            System.out.println("27. Search camp by ID.");
            System.out.println("------------------------------------");
            System.out.println("28. Change password of this account.");
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
                    MenuManager.searchPrisonerByID();
                    break;

                case 6:
                    MenuManager.searchPrisonerByName();

                case 7:
                    MenuManager.showInfoOfWardens();
                    break;

                case 8:
                    MenuManager.addNewWarden();
                    break;

                case 9:
                    MenuManager.updateInfoWarden();
                    break;

                case 10:
                    MenuManager.deleteWarden();
                    break;

                case 11:
                    MenuManager.searchWardenByID();
                    break;

                case 12:
                    MenuManager.searchWardenByName();
                    break;

                case 13:
                    MenuManager.showInfoOfCellRooms();
                    break;

                case 14:
                    MenuManager.addNewCellRoom();
                    break;

                case 15:
                    MenuManager.updateInfoCellRoom();
                    break;

                case 16:
                    MenuManager.deleteCellRoom();
                    break;

                case 17:
                    MenuManager.addPrisonerToCellRoom();
                    break;

                case 18:
                    MenuManager.removePrisonerFromCellRoom();
                    break;

                case 19:
                    MenuManager.searchCellRoomByNumber();

                case 20:
                    MenuManager.showInfoOfCamps();
                    break;

                case 21:
                    MenuManager.addNewCamp();
                    break;

                case 22:
                    MenuManager.updateInfoCamp();
                    break;

                case 23:
                    MenuManager.deleteCamp();
                    break;

                case 24:
                    MenuManager.addCellRoomToCamp();
                    break;

                case 25:
                    MenuManager.removeCellRoomFromCamp();
                    break;

                case 26:
                    MenuManager.setWardenForCamp();
                    break;

                case 27:
                    MenuManager.searchCampByID();
                    break;

                case 28:
                    MenuManager.changePassword();
                    break;

                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
