package view;

import authentication.Account;
import authentication.AccountLevel;
import storage.LoadingFileManagers;

import java.util.Scanner;

public class MainLoginMenu {
    public static void enable() {

        while (true) {
            System.out.println("Thanh Xuan Prison System ");
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

                    } else if (account.getRole().equals(AccountLevel.STAFF)) {
                        System.out.println("---------------------------");
                        System.out.println("MOVING TO STAFF MENU....");
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
