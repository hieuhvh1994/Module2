package view;

import authentication.LeaderMenuManager;

import java.util.Scanner;

public class LeaderMenu {
    public static void enable() {

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
            System.out.println("------------------------------------");
            System.out.println("13. Show information of camps.");
            System.out.println("14. Add new camp.");
            System.out.println("15. Update information of camp.");
            System.out.println("16. Delete camp.");
            System.out.println("------------------------------------");
            System.out.println("17. Show information of staff accounts.");
            System.out.println("18. Add new staff account.");
            System.out.println("19. Update information of staff account.");
            System.out.println("20. Delete staff account.");
            System.out.println("------------------------------------");
            System.out.println("21. Change password of this account.");
            System.out.println("22. Change information of this account.");
            System.out.println("------------------------------------");
            System.out.println("0. Exit!");

            Scanner choiceScanner = new Scanner(System.in);
            int choice = choiceScanner.nextInt();

            LeaderMenuManager leaderMenuManager = new LeaderMenuManager();

            switch (choice) {
                case 1:
                LeaderMenuManager.showInfoOfPrisoners();
                break;
            }
        }
    }
}
