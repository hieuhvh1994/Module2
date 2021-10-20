package view;

import authentication.Account;
import storage.LoadingFileManagers;

import java.util.List;
import java.util.Scanner;

public class MainLoginMenu {
    public static void mainLoginMenu() {

        LoadingFileManagers.loadManagementFiles();

        while (true) {
            System.out.println("Thanh Xuan Prison System ");
            System.out.println("--------------------------");

            Scanner usernameScanner = new Scanner(System.in);
            System.out.println("Enter username: ");
            String username = usernameScanner.nextLine();


        }
    }
}
