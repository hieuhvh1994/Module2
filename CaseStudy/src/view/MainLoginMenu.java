package view;

import authentication.Account;
import authentication.AccountLevel;
import storage.LoadingFileManagers;

import java.io.IOException;
import java.util.Scanner;

public class MainLoginMenu {
    public static void enable() throws IOException {

        while (true) {
            System.out.println("Thanh Xuan Prison Login System ");
            System.out.println("--------------------------");

            Scanner usernameScanner = new Scanner(System.in);
            System.out.println("Enter username: ");
            String username = usernameScanner.nextLine();
            Account account = LoadingFileManagers.accountManager.searchByUsername(username);
            if (account!=null) {
                System.out.println("Enter password: ");
                Scanner passwordScanner = new Scanner(System.in);
                String password = passwordScanner.nextLine();
                if(account.getPassword().equals(password)) {
                    System.out.println("Welcome " + account.getFullName());
                    if (account.getRole().equals(AccountLevel.LEADER)) {
                        System.out.println("---------------------------");
                        System.out.println("MOVING TO LEADER MENU....");
                        LoadingFileManagers.loggingAccount = account;
                        LeaderMenu.enable();

                    } else if (account.getRole().equals(AccountLevel.STAFF)) {
                        System.out.println("---------------------------");
                        System.out.println("MOVING TO STAFF MENU....");
                        LoadingFileManagers.loggingAccount = account;
                        StaffMenu.enable();
                    }
                } else {
                    System.out.println("Wrong password!!");
                }
            } else {
                System.out.println("Wrong username!!");
            }


        }
    }
}
