package view;

import authentication.Account;
import authentication.AccountLevel;
import controller.AccountManager;
import storage.LoadingFileManagers;

import java.util.Scanner;

public class MainLoginMenu {
    public static void mainLoginMenu() {

        LoadingFileManagers.loadManagementFiles();
        AccountManager accountManager = new AccountManager();
        accountManager.setAccountList(LoadingFileManagers.accounts);
        accountManager.setFileManagerAccount(LoadingFileManagers.fileManagerAccount);


        while (true) {
            System.out.println("Thanh Xuan Prison System ");
            System.out.println("--------------------------");

            Scanner usernameScanner = new Scanner(System.in);
            System.out.println("Enter username: ");
            String username = usernameScanner.nextLine();
            Account account = accountManager.searchByUsername(username);
            if (account!=null) {
                System.out.println("Enter password: ");
                Scanner passwordScanner = new Scanner(System.in);
                String password = passwordScanner.nextLine();
                if(account.getPassword().equals(password)) {
                    System.out.println("Welcome " + account.getFullName());
                    if (account.getRole().equals(AccountLevel.LEADER)) {
                        
                    }
                }
            }


        }
    }
}
