package controller;

import authentication.Account;
import authentication.AccountLevel;
import model.Camp;
import model.CellRoom;
import model.Prisoner;
import model.Warden;
import storage.LoadingFileManagers;
import view.LeaderMenu;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Class Menu Manager
public class MenuManager {
    //----------------Prisoner Functions---------------------
    //Show information of Prisoners
    public static void showInfoOfPrisoners() {
        LoadingFileManagers.prisonerManager.showAllList();
    }

    //Add new Prisoner to Prisoner List
    public static void addNewPrisoner() throws IOException {
        //Scanner Inputs of New Information of new Prisoner
        System.out.println("Adding new prisoner: ");

        //Name
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the prisoner: ");
        String name = inputName.nextLine();

        //Address
        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address of the prisoner: ");
        String address = inputAddress.nextLine();

        //ID
        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the id of the prisoner: ");
        //Check the ID is unique
        int loopId = -1;
        int id = inputId.nextInt();

        for (int i =0; i<LoadingFileManagers.prisonerManager.getPrisonerList().size(); i++) {
            if (LoadingFileManagers.prisonerManager.getPrisonerList().get(i).getId() == id) {
                loopId = i;
            }
        }
        while (loopId != -1) {
            System.out.println("This ID is existed!! Please Enter different ID: ");
            loopId = -1;
            for (int i =0; i<LoadingFileManagers.prisonerManager.getPrisonerList().size(); i++) {
                if (LoadingFileManagers.prisonerManager.getPrisonerList().get(i).getId() == id) {
                    loopId = i;
                }
            }
            Scanner inputDiffId = new Scanner(System.in);
            id = inputDiffId.nextInt();
        }

        //DOB
        Scanner inputYearOB = new Scanner(System.in);
        System.out.println("Enter the Year of Birth of the prisoner: ");
        int yearOB = inputYearOB.nextInt();

        Scanner inputMonthOB = new Scanner(System.in);
        System.out.println("Enter the Month of Birth of the prisoner: ");
        int monthOB = inputMonthOB.nextInt();

        Scanner inputDayOB = new Scanner(System.in);
        System.out.println("Enter the Day of Birth of the prisoner: ");
        int dayOB = inputDayOB.nextInt();

        LocalDate dob = LocalDate.of(yearOB, monthOB, dayOB);


        //Crime Level
        Scanner inputCrimeLevel = new Scanner(System.in);
        System.out.println("Enter the crime level of the prisoner: ");
        String crimeLevel = inputCrimeLevel.nextLine();


        //Years in Prison Sentence
        Scanner inputYearOP = new Scanner(System.in);
        System.out.println("Enter the sentence (in year) of the prisoner: ");
        int yearOP = inputYearOP.nextInt();

        //Date Of Execution
        Scanner inputYearOE = new Scanner(System.in);
        System.out.println("Enter the Year of Execution of the prisoner: ");
        int yearOE = inputYearOE.nextInt();

        Scanner inputMonthOE = new Scanner(System.in);
        System.out.println("Enter the Month of Execution of the prisoner: ");
        int monthOE = inputMonthOE.nextInt();

        Scanner inputDayOE = new Scanner(System.in);
        System.out.println("Enter the Day of Execution of the prisoner: ");
        int dayOE = inputDayOE.nextInt();

        LocalDate doe = LocalDate.of(yearOE, monthOE, dayOE);

        //Adding the new Prisoner to the Prisoner Manager List
        LoadingFileManagers.prisonerManager.add(new Prisoner(name, address, id, dob, crimeLevel, yearOP, doe));

        //Print out the result
        System.out.println("Successful added!!");

    }

    //Update the Information of the Prisoner
    public static void updateInfoPrisoner() throws IOException {
        //Print the list of prisoners
        LoadingFileManagers.prisonerManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");

        //Get the choice of the prisoner
        System.out.println("Enter the index of the prisoner to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice != 0) {
            System.out.println("Updating the information of the prisoner: ");

            //Get Inputs to update information of the prisoner
            //Name
            Scanner inputName = new Scanner(System.in);
            System.out.println("Enter the name of the prisoner: ");
            String name = inputName.nextLine();

            //Address
            Scanner inputAddress = new Scanner(System.in);
            System.out.println("Enter the address of the prisoner: ");
            String address = inputAddress.nextLine();

            //ID
            Scanner inputId = new Scanner(System.in);
            System.out.println("Enter the id of the prisoner: ");
            //Check the ID is unique
            int loopId = -1;
            int id = inputId.nextInt();

            for (int i =0; i<LoadingFileManagers.prisonerManager.getPrisonerList().size(); i++) {
                if (LoadingFileManagers.prisonerManager.getPrisonerList().get(i).getId() == id) {
                    loopId = i;
                }
            }
            while (loopId != -1) {
                System.out.println("This ID is existed!! Please Enter different ID: ");
                loopId = -1;
                for (int i =0; i<LoadingFileManagers.prisonerManager.getPrisonerList().size(); i++) {
                    if (LoadingFileManagers.prisonerManager.getPrisonerList().get(i).getId() == id) {
                        loopId = i;
                    }
                }
                Scanner inputDiffId = new Scanner(System.in);
                id = inputDiffId.nextInt();
            }

            //DOB
            Scanner inputYearOB = new Scanner(System.in);
            System.out.println("Enter the Year of Birth of the prisoner: ");
            int yearOB = inputYearOB.nextInt();

            Scanner inputMonthOB = new Scanner(System.in);
            System.out.println("Enter the Month of Birth of the prisoner: ");
            int monthOB = inputMonthOB.nextInt();

            Scanner inputDayOB = new Scanner(System.in);
            System.out.println("Enter the Day of Birth of the prisoner: ");
            int dayOB = inputDayOB.nextInt();

            LocalDate dob = LocalDate.of(yearOB, monthOB, dayOB);

            //Crime Level
            Scanner inputCrimeLevel = new Scanner(System.in);
            System.out.println("Enter the crime level of the prisoner: ");
            String crimeLevel = inputCrimeLevel.nextLine();

            //Years in Prison Sentence
            Scanner inputYearOP = new Scanner(System.in);
            System.out.println("Enter the sentence (in year) of the prisoner: ");
            int yearOP = inputYearOP.nextInt();

            //Date Of Execution
            Scanner inputYearOE = new Scanner(System.in);
            System.out.println("Enter the Year of Execution of the prisoner: ");
            int yearOE = inputYearOE.nextInt();

            Scanner inputMonthOE = new Scanner(System.in);
            System.out.println("Enter the Month of Execution of the prisoner: ");
            int monthOE = inputMonthOE.nextInt();

            Scanner inputDayOE = new Scanner(System.in);
            System.out.println("Enter the Day of Execution of the prisoner: ");
            int dayOE = inputDayOE.nextInt();

            LocalDate doe = LocalDate.of(yearOE, monthOE, dayOE);

            //Updating the new prisoner to the list Prisoners
            Prisoner oldPrisoner = LoadingFileManagers.prisonerManager.getPrisonerList().get(choice-1);
            Prisoner newPrisoner = new Prisoner(name, address, id, dob, crimeLevel, yearOP, doe);

            LoadingFileManagers.prisonerManager.update(choice-1 ,newPrisoner);

            //Updating the prisoner in the cell room list
            int prisonerPos = -1;
            for (int i=0; i<  LoadingFileManagers.cellRoomManager.getCellRoomList().size();i++ ) {
                if (LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getPrisoners().contains(oldPrisoner)) {
                    prisonerPos = LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getPrisoners().indexOf(oldPrisoner);
                    LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getPrisoners().set(prisonerPos, newPrisoner);
                    break;
                }
            }

            //Print out the result
            System.out.println("Successful updated!!");
        } else {
            //Exit
            LeaderMenu.enable();
        }


    }

    //Delete prisoner
    public static void deletePrisoner() throws IOException {
        //Print out Prisoner list
        LoadingFileManagers.prisonerManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the prisoner to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice !=0) {
            //Remove prisoner from the prisoner list
            LoadingFileManagers.prisonerManager.deleteByIndex(choice-1);

            //Print the result
            System.out.println("Successful removed!!");
        } else {
            //Exit
            LeaderMenu.enable();
        }

    }

    //Search Prisoner By ID
    public static void searchPrisonerByID() {
        //Input Search ID
        System.out.println("Enter the ID of the Prisoner: ");
        Scanner inputID = new Scanner(System.in);
        int idSearch = inputID.nextInt();

        //Find the Prisoner
        Prisoner result = null;
        for (Prisoner c : LoadingFileManagers.prisonerManager.getPrisonerList()) {
            if (c.getId() == idSearch) {
                result = c;
                break;
            }
        }

        //Result
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("There is no prisoner matches with this ID!!");
        }

    }

    //Search Prisoner By Name
    public static void searchPrisonerByName() {
        //Input search name
        System.out.println("Enter the name of the Prisoner: ");
        Scanner inputName = new Scanner(System.in);
        String nameSearch = inputName.nextLine();

        //Find the prisoner
        Prisoner result = null;
        for (Prisoner c : LoadingFileManagers.prisonerManager.getPrisonerList()) {
            if (c.getName().equals(nameSearch)) {
                result = c;
                break;
            }
        }

        //Print out the result
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("There is no prisoner matches with this name!!");
        }
    }


    //----------------------Warden Functions-------------------------------
    //Show all information of Warden List
    public static void showInfoOfWardens() {
        LoadingFileManagers.wardenManager.showAllList();
    }


    //Add new warden
    public static void addNewWarden() throws IOException {
        System.out.println("Adding new warden: ");

        //Inputs of the new warden's information
        //Name
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the warden: ");
        String name = inputName.nextLine();

        //Address
        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address of the warden: ");
        String address = inputAddress.nextLine();

        //ID
        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the id of the warden: ");

        //Check id is unique
        int loopId = -1;
        int id = inputId.nextInt();

        for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
            if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == id) {
                loopId = i;
            }
        }
        while (loopId != -1) {
            System.out.println("This ID is existed!! Please Enter different ID: ");
            loopId = -1;
            for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == id) {
                    loopId = i;
                }
            }
            Scanner inputDiffId = new Scanner(System.in);
            id = inputDiffId.nextInt();
        }

        //DOB
        Scanner inputYearOB = new Scanner(System.in);
        System.out.println("Enter the Year of Birth of the warden: ");
        int yearOB = inputYearOB.nextInt();

        Scanner inputMonthOB = new Scanner(System.in);
        System.out.println("Enter the Month of Birth of the warden: ");
        int monthOB = inputMonthOB.nextInt();

        Scanner inputDayOB = new Scanner(System.in);
        System.out.println("Enter the Day of Birth of the warden: ");
        int dayOB = inputDayOB.nextInt();

        LocalDate dob = LocalDate.of(yearOB, monthOB, dayOB);

        //Working Start Date
        Scanner inputYearWSD = new Scanner(System.in);
        System.out.println("Enter the Year of Working Start Date of the warden: ");
        int yearWSD = inputYearWSD.nextInt();

        Scanner inputMonthWSD = new Scanner(System.in);
        System.out.println("Enter the Month of Working Start Date of the warden: ");
        int monthWSD = inputMonthWSD.nextInt();

        Scanner inputDayWSD = new Scanner(System.in);
        System.out.println("Enter the Day of Working Start Date of the warden: ");
        int dayWSD = inputDayWSD.nextInt();

        LocalDate wsd = LocalDate.of(yearWSD, monthWSD, dayWSD);

        //Position
        Scanner inputPosition = new Scanner(System.in);
        System.out.println("Enter the position of the warden: ");
        String position = inputPosition.nextLine();

        //Creating Account for the new Warden
        System.out.println("Creating account for the warden...");

        //username
        Scanner inputUsername = new Scanner(System.in);
        System.out.println("Enter username: ");

        //Check the username is unique
        int loop = -1;
        String username = inputUsername.nextLine();
        for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
            if (LoadingFileManagers.accountManager.getAccountList().get(i).getUsername().equals(username)) {
                loop = i;
            }
        }
        while (loop != -1) {
            System.out.println("The username is existed!! Please enter different username: ");
            loop = -1;
            for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                if (LoadingFileManagers.accountManager.getAccountList().get(i).getUsername().equals(username)) {
                    loop = i;
                }
            }
            Scanner inputDiffUsername = new Scanner(System.in);
            username = inputDiffUsername.nextLine();
        }

        //Password
        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = inputPassword.nextLine();

        //Role
        Scanner inputRole = new Scanner(System.in);
        System.out.println("1. Leader");
        System.out.println("2. Staff");
        System.out.println("Enter the index of role");
        int roleChoice = inputRole.nextInt();

        AccountLevel role = AccountLevel.STAFF;
        if (roleChoice == 1) {
            role = AccountLevel.LEADER;
        }

        //Adding new Warden to the Warden List and new account to the Account List
        Account account = new Account(username, password, role, name, id);
        Warden warden = new Warden(name, address, dob, id, wsd, position, account);

        LoadingFileManagers.wardenManager.add(warden);
        LoadingFileManagers.accountManager.add(account);

        //Because there is only one Leader account is existed then we need to change the role of other account to STAFF
        int oldIdLeader = -1;
        if (account.getRole() == AccountLevel.LEADER) {
            //Change the role of the Account
            for (Account a: LoadingFileManagers.accountManager.getAccountList()) {
                if (a.getRole() == AccountLevel.LEADER) {
                    a.setRole(AccountLevel.STAFF);
                    oldIdLeader = a.getId();
                }
            }

            //Change the position of the warden
            for (Warden w : LoadingFileManagers.wardenManager.getWardenList()) {
                if (w.getId() == oldIdLeader) {
                    w.setPosition("Staff");
                }
            }

            LoadingFileManagers.prisonManager.setWardenLeader(warden);
        }

        //Print out the result
        System.out.println("Successful added!!");

    }


    //Update information of the warden
    public static void updateInfoWarden() throws IOException {
        LoadingFileManagers.wardenManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");

        //Choose the warden to update information
        System.out.println("Enter the index of the warden to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice !=0) {
            System.out.println("Updating the information of the warden: ");

            //Name
            Scanner inputName = new Scanner(System.in);
            System.out.println("Enter the name of the warden: ");
            String name = inputName.nextLine();


            //Address
            Scanner inputAddress = new Scanner(System.in);
            System.out.println("Enter the address of the warden: ");
            String address = inputAddress.nextLine();

            //ID
            Scanner inputId = new Scanner(System.in);
            System.out.println("Enter the ID of the warden: ");

            //Check ID is unique
            int loopId = -1;
            int id = inputId.nextInt();

            for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == id) {
                    loopId = i;
                }
            }
            while (loopId != -1) {
                System.out.println("This ID is existed!! Please Enter different ID: ");
                loopId = -1;
                for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                    if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == id) {
                        loopId = i;
                    }
                }
                Scanner inputDiffId = new Scanner(System.in);
                id = inputDiffId.nextInt();
            }

            //DOB
            Scanner inputYearOB = new Scanner(System.in);
            System.out.println("Enter the Year of Birth of the warden: ");
            int yearOB = inputYearOB.nextInt();

            Scanner inputMonthOB = new Scanner(System.in);
            System.out.println("Enter the Month of Birth of the warden: ");
            int monthOB = inputMonthOB.nextInt();

            Scanner inputDayOB = new Scanner(System.in);
            System.out.println("Enter the Day of Birth of the warden: ");
            int dayOB = inputDayOB.nextInt();

            LocalDate dob = LocalDate.of(yearOB, monthOB, dayOB);


            //WSD
            Scanner inputYearWSD = new Scanner(System.in);
            System.out.println("Enter the Year of Working Start Date of the warden: ");
            int yearWSD = inputYearWSD.nextInt();

            Scanner inputMonthWSD = new Scanner(System.in);
            System.out.println("Enter the Month of Working Start Date of the warden: ");
            int monthWSD = inputMonthWSD.nextInt();

            Scanner inputDayWSD = new Scanner(System.in);
            System.out.println("Enter the Day of Working Start Date of the warden: ");
            int dayWSD = inputDayWSD.nextInt();

            LocalDate wsd = LocalDate.of(yearWSD, monthWSD, dayWSD);

            //Creating new account for the warden
            System.out.println("Creating account for the warden...");

            //username
            Scanner inputUsername = new Scanner(System.in);
            System.out.println("Enter username: ");

            //Check the username is unique
            int loop = -1;
            String username = inputUsername.nextLine();
            for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                if (LoadingFileManagers.accountManager.getAccountList().get(i).getUsername().equals(username)) {
                    loop = i;
                }
            }
            while (loop != -1) {
                System.out.println("This username is existed!! Please enter different username: ");
                loop = -1;
                for (int i =0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                    if (LoadingFileManagers.accountManager.getAccountList().get(i).getUsername().equals(username)) {
                        loop = i;
                    }
                }
                Scanner inputDiffUsername = new Scanner(System.in);
                username = inputDiffUsername.nextLine();
            }

            //Password
            Scanner inputPassword = new Scanner(System.in);
            System.out.println("Enter password: ");
            String password = inputPassword.nextLine();

            //Role
            System.out.println();
            Scanner inputRole = new Scanner(System.in);
            System.out.println("1. Leader");
            System.out.println("2. Staff");
            System.out.println("Enter the index of role:");
            int roleChoice = inputRole.nextInt();

            //Set role and position
            String position;
            AccountLevel role;
            if (roleChoice == 1) {
                role = AccountLevel.LEADER;
                position = "Leader";
            } else {
                role = AccountLevel.STAFF;
                position = "Staff";
            }


            Account account = new Account(username, password, role, name, id);
            Warden warden = new Warden(name, address, dob, id, wsd, position, account);


            int oldIdWarden = LoadingFileManagers.wardenManager.getWardenList().get(choice-1).getId();
            LoadingFileManagers.wardenManager.update(choice-1, warden);

            //Delete old account
            for (int i = 0; i< LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == oldIdWarden) {
                    LoadingFileManagers.accountManager.deleteByIndex(i);
                }
            }


            //Change the role and position to other accounts and wardens
            int oldIdLeader = -1;
            if (account.getRole() == AccountLevel.LEADER) {
                for (Account a: LoadingFileManagers.accountManager.getAccountList()) {
                    if (a.getRole() == AccountLevel.LEADER) {
                        a.setRole(AccountLevel.STAFF);
                        oldIdLeader = a.getId();
                    }
                }

                for (Warden w : LoadingFileManagers.wardenManager.getWardenList()) {
                    if (w.getId() == oldIdLeader) {
                        w.setPosition("Staff");
                    }
                }
            //Set new account and warden
                LoadingFileManagers.prisonManager.setWardenLeader(warden);
            }

            LoadingFileManagers.accountManager.add(account);


            System.out.println("Successful updated!!");
        } else {
            LeaderMenu.enable();
        }


    }

    //Delete Warden
    public static void deleteWarden() throws IOException {
        LoadingFileManagers.wardenManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");

        //Get the warden to delete
        System.out.println("Enter the index of the warden to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice !=0 ) {
            int id = LoadingFileManagers.wardenManager.getWardenList().get(choice-1).getId();

            int index = -1;

            for (int i=0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
                if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == id) {
                    index = i;
                }
            }

            LoadingFileManagers.accountManager.deleteByIndex(index);

            LoadingFileManagers.wardenManager.deleteByIndex(choice-1);

            //Check is there a leader in warden list or not
            boolean haveLeader = false;
            for (Account a : LoadingFileManagers.accountManager.getAccountList()) {
                if (a.getRole() == AccountLevel.LEADER) {
                    haveLeader = true;
                    break;
                }
            }

            //Change role leader to another warden if there is no leader in warden list
            if (LoadingFileManagers.wardenManager.getWardenList().size() > 0 || !haveLeader) {
                LoadingFileManagers.wardenManager.getWardenList().get(0).setPosition("Leader");
                for (Account a : LoadingFileManagers.accountManager.getAccountList()) {
                    if (a.getId() == LoadingFileManagers.wardenManager.getWardenList().get(0).getId()) {
                        a.setRole(AccountLevel.LEADER);
                    }
                }
            }

            //Print out the result.
            System.out.println("Successful removed!!");
        } else {
            LeaderMenu.enable();
        }

    }

    //Search Warden By ID
    public static void searchWardenByID() {
        //Enter the Warden ID
        System.out.println("Enter the ID of the Warden: ");
        Scanner inputID = new Scanner(System.in);
        int idSearch = inputID.nextInt();

        //Check the id in the warden list
        Warden result = null;
        for (Warden w : LoadingFileManagers.wardenManager.getWardenList()) {
            if (w.getId() == idSearch) {
                result = w;
                break;
            }
        }

        //Print out result
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("There is no warden matches with this ID!!");
        }


    }

    //Search Warden By Name
    public static void searchWardenByName() {
        //Get Input
        System.out.println("Enter the name of the Warden: ");
        Scanner inputName = new Scanner(System.in);
        String nameSearch = inputName.nextLine();

        Warden result = null;
        for (Warden w : LoadingFileManagers.wardenManager.getWardenList()) {
            if (w.getName().equals(nameSearch)) {
                result = w;
                break;
            }
        }

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("There is no warden matches with this name!!");
        }
    }


    //Cell Room Functions
    public static void showInfoOfCellRooms() {
        LoadingFileManagers.cellRoomManager.showAllList();
    }

    public static void addNewCellRoom() throws IOException {
        System.out.println("Adding new cell room: ");
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter the room number of the cell room: ");
        int loop = -1;
        int number = inputNumber.nextInt();
        for (int i =0; i<LoadingFileManagers.cellRoomManager.getCellRoomList().size(); i++) {
            if (LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getNumber()== number) {
                loop = i;
            }
        }
        while (loop != -1) {
            System.out.println("This room number is existed!! Please enter different room number: ");
            loop = -1;
            for (int i =0; i<LoadingFileManagers.cellRoomManager.getCellRoomList().size(); i++) {
                if (LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getNumber() == number) {
                    loop = i;
                }
            }
            Scanner inputDiffNumber = new Scanner(System.in);
            number = inputDiffNumber.nextInt();
        }


        Scanner inputBeds= new Scanner(System.in);
        System.out.println("Enter the number of bed of the cell room: ");
        int beds = inputBeds.nextInt();

        LoadingFileManagers.cellRoomManager.add(new CellRoom(number, beds));

        System.out.println("Successful added!!");

    }

    public static void updateInfoCellRoom() throws IOException {
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice != 0) {
            System.out.println("Updating the information of the cell room: ");
            Scanner inputNumber = new Scanner(System.in);
            System.out.println("Enter the room number of the cell room: ");
            int loop = -1;
            int number = inputNumber.nextInt();
            for (int i =0; i<LoadingFileManagers.cellRoomManager.getCellRoomList().size(); i++) {
                if (LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getNumber()== number) {
                    loop = i;
                }
            }
            while (loop != -1) {
                System.out.println("This room number is existed!! Please enter different room number: ");
                loop = -1;
                for (int i =0; i<LoadingFileManagers.cellRoomManager.getCellRoomList().size(); i++) {
                    if (LoadingFileManagers.cellRoomManager.getCellRoomList().get(i).getNumber() == number) {
                        loop = i;
                    }
                }
                Scanner inputDiffNumber = new Scanner(System.in);
                number = inputDiffNumber.nextInt();
            }


            Scanner inputBeds= new Scanner(System.in);
            System.out.println("Enter the number of bed of the cell room: ");
            int beds = inputBeds.nextInt();

            LoadingFileManagers.cellRoomManager.update(choice-1, new CellRoom(number, beds));

            System.out.println("Successful Updated!!");
        } else {
            LeaderMenu.enable();
        }

    }

    public static void deleteCellRoom() throws IOException {
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice != 0) {
            LoadingFileManagers.cellRoomManager.deleteByIndex(choice-1);

            System.out.println("Successful removed!!");
        } else {
            LeaderMenu.enable();
        }



    }

    public static void addPrisonerToCellRoom() throws IOException {
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to add prisoner: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choiceCellRoom = choiceScanner.nextInt();

        if (choiceCellRoom != 0) {
            List<Prisoner> isAdded = new ArrayList<>();
            for (CellRoom c : LoadingFileManagers.cellRoomManager.getCellRoomList()) {
                isAdded.addAll(c.getPrisoners());
            }


            for (int i = 0; i< LoadingFileManagers.prisonerManager.getPrisonerList().size(); i++) {
                if (!isAdded.contains(LoadingFileManagers.prisonerManager.getPrisonerList().get(i))) {
                    System.out.println(i+1 + ". " + LoadingFileManagers.prisonerManager.getPrisonerList().get(i));
                }
            }
            System.out.println("0. Exit!!");
            System.out.println("--------------");
            System.out.println("Enter the index of the prisoner to add to the cell room: ");
            Scanner prisonerScanner = new Scanner(System.in);
            int choicePrisoner = prisonerScanner.nextInt();

            if (choicePrisoner != 0) {
                LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).addNewPrisoner(LoadingFileManagers.prisonerManager.getPrisonerList().get(choicePrisoner-1));
                System.out.println("Successful added!!");
            } else {
                LeaderMenu.enable();
            }
        } else {
            LeaderMenu.enable();
        }




    }

    public static void removePrisonerFromCellRoom() throws IOException {
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to add prisoner: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choiceCellRoom = choiceScanner.nextInt();

        if (choiceCellRoom != 0) {
            for (int i = 0; i< LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).getPrisoners().size(); i++) {
                System.out.println(i+1 + ". " + LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).getPrisoners().get(i) );
            }

            System.out.println("0. Exit!!");

            System.out.println("--------------");
            System.out.println("Enter the index of the prisoner to remove from the cell room: ");
            Scanner prisonerScanner = new Scanner(System.in);
            int choicePrisoner = prisonerScanner.nextInt();

            if (choicePrisoner != 0) {
                LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).getPrisoners().remove(choicePrisoner-1);
                System.out.println("Successful removed!!");
            } else {
                LeaderMenu.enable();
            }
        }




    }

    public static void searchCellRoomByNumber() {
        System.out.println("Enter the room number of the cell room: ");
        Scanner inputNumber = new Scanner(System.in);
        int numberSearch = inputNumber.nextInt();

        CellRoom result = null;
        for (CellRoom c : LoadingFileManagers.cellRoomManager.getCellRoomList()) {
            if (c.getNumber() == numberSearch) {
                result = c;
                break;
            }
        }

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("There is no cell room matches with this Room Number!!");
        }

    }

    //Camp Functions
    public static void showInfoOfCamps() {
        LoadingFileManagers.campManager.showAllList();
    }

    public static void addNewCamp() throws IOException {
        System.out.println("Adding new camp: ");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the camp: ");
        int loop = -1;
        String name = inputName.nextLine();
        for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
            if (LoadingFileManagers.campManager.getCampList().get(i).getName().equals(name)) {
                loop = i;
            }
        }
        while (loop != -1) {
            System.out.println("This name is existed!! Please enter different name: ");
            loop = -1;
            for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
                if (LoadingFileManagers.campManager.getCampList().get(i).getName().equals(name)) {
                    loop = i;
                }
            }
            Scanner inputDiffName = new Scanner(System.in);
            name = inputDiffName.nextLine();
        }

        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the id of the camp: ");
        int loopId = -1;
        int id = inputId.nextInt();
        for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
            if (LoadingFileManagers.campManager.getCampList().get(i).getId() == id) {
                loopId = i;
            }
        }
        while (loopId != -1) {
            System.out.println("This ID is existed!! Please enter different ID: ");
            loopId = -1;
            for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
                if (LoadingFileManagers.campManager.getCampList().get(i).getId() == id) {
                    loopId = i;
                }
            }
            Scanner inputDiffId = new Scanner(System.in);
            id = inputDiffId.nextInt();
        }

        Camp camp = new Camp(name, id);

        LoadingFileManagers.campManager.add(camp);

        System.out.println("Successful added!!");

    }

    public static void updateInfoCamp() throws IOException {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice != 0) {
            Scanner inputName = new Scanner(System.in);
            System.out.println("Enter the name of the camp: ");
            int loop = -1;
            String name = inputName.nextLine();
            for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
                if (LoadingFileManagers.campManager.getCampList().get(i).getName().equals(name)) {
                    loop = i;
                }
            }
            while (loop != -1) {
                System.out.println("This name is existed!! Please enter different name: ");
                loop = -1;
                for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
                    if (LoadingFileManagers.campManager.getCampList().get(i).getName().equals(name)) {
                        loop = i;
                    }
                }
                Scanner inputDiffName = new Scanner(System.in);
                name = inputDiffName.nextLine();
            }

            Scanner inputId = new Scanner(System.in);
            System.out.println("Enter the id of the camp: ");
            int loopId = -1;
            int id = inputId.nextInt();
            for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
                if (LoadingFileManagers.campManager.getCampList().get(i).getId() == id) {
                    loopId = i;
                }
            }
            while (loopId != -1) {
                System.out.println("This ID is existed!! Please enter different ID: ");
                loopId = -1;
                for (int i =0; i<LoadingFileManagers.campManager.getCampList().size(); i++) {
                    if (LoadingFileManagers.campManager.getCampList().get(i).getId() == id) {
                        loopId = i;
                    }
                }
                Scanner inputDiffId = new Scanner(System.in);
                id = inputDiffId.nextInt();
            }

            LoadingFileManagers.campManager.update(choice - 1, new Camp(name, id));

            System.out.println("Successful updated!!");

        } else {
            LeaderMenu.enable();
        }


    }

    public static void deleteCamp() throws IOException {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        if (choice != 0) {
            LoadingFileManagers.campManager.deleteByIndex(choice-1);

            System.out.println("Successful removed!!");
        } else {
            LeaderMenu.enable();
        }



    }

    public static void addCellRoomToCamp() throws IOException {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to add cell room: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choiceCamp = choiceScanner.nextInt();

        if (choiceCamp != 0) {
            List<CellRoom> isAdded = new ArrayList<>();
            for (Camp c : LoadingFileManagers.campManager.getCampList()) {
                isAdded.addAll(c.getCellRooms());
            }


            for (int i = 0; i< LoadingFileManagers.cellRoomManager.getCellRoomList().size(); i++) {
                if (!isAdded.contains(LoadingFileManagers.cellRoomManager.getCellRoomList().get(i))) {
                    System.out.println(i+1 + ". " + LoadingFileManagers.cellRoomManager.getCellRoomList().get(i));
                }
            }

            System.out.println("0. Exit!!");
            System.out.println("--------------");
            System.out.println("Enter the index of the cell room to add to the camp: ");
            Scanner cellRoomScanner = new Scanner(System.in);
            int choiceCellRoom = cellRoomScanner.nextInt();

            if (choiceCellRoom != 0) {
                LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).addNewCellRoom(LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1));
                System.out.println("Successful added!!");
            } else {
                LeaderMenu.enable();
            }
        } else {
            LeaderMenu.enable();
        }




    }

    public static void removeCellRoomFromCamp() throws IOException {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to add cell room: ");
        Scanner campScanner = new Scanner(System.in);
        int choiceCamp = campScanner.nextInt();

        if (choiceCamp !=0) {
            for (int i = 0; i< LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).getCellRooms().size(); i++) {
                System.out.println(i+1 + ". " + LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).getCellRooms().get(i) );
            }

            System.out.println("0. Exit!!");

            System.out.println("--------------");
            System.out.println("Enter the index of the cell room to remove from the camp: ");
            Scanner cellRoomScanner = new Scanner(System.in);
            int choiceCellRoom = cellRoomScanner.nextInt();

            if (choiceCellRoom != 0 ) {
                LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).getCellRooms().remove(choiceCellRoom-1);
                System.out.println("Successful removed!!");
            } else {
                LeaderMenu.enable();
            }



        } else {
            LeaderMenu.enable();
        }




    }

    public static void setWardenForCamp() throws IOException {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("0. Exit!!");
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to set warden: ");
        Scanner campScanner = new Scanner(System.in);
        int choiceCamp = campScanner.nextInt();

        if (choiceCamp != 0) {
            LoadingFileManagers.wardenManager.showAllList();
            System.out.println("0. Exit!!");
            System.out.println("--------------");
            System.out.println("Enter the index of the warden to update information: ");
            Scanner choiceScanner = new Scanner(System.in);
            int choice = choiceScanner.nextInt();

            if (choice != 0) {
                LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).setWarden(LoadingFileManagers.wardenManager.getWardenList().get(choice-1));
                System.out.println("Set Successfully!!");
            } else {
                LeaderMenu.enable();
            }


        } else {
            LeaderMenu.enable();
        }



    }

    public static void searchCampByID() {
        System.out.println("Enter the ID of the Camp: ");
        Scanner inputID = new Scanner(System.in);
        int idSearch = inputID.nextInt();

        Camp result = null;
        for (Camp c : LoadingFileManagers.campManager.getCampList()) {
            if (c.getId() == idSearch) {
                result = c;
                break;
            }
        }

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("There is no camp matches with this ID!!");
        }
    }


    //Account function
    public static void changePassword() {
        for (Account a : LoadingFileManagers.accountManager.getAccountList()) {
            if (a == LoadingFileManagers.loggingAccount) {
                Scanner inputPassword = new Scanner(System.in);
                System.out.println("Enter new password: ");
                String newPassword = inputPassword.nextLine();
                a.setPassword(newPassword);
                System.out.println("Changed password successfully!!");
                break;
            }
        }
    }

}
