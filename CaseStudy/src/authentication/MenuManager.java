package authentication;

import model.Camp;
import model.CellRoom;
import model.Prisoner;
import model.Warden;
import storage.LoadingFileManagers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuManager {
    //Prisoner Functions
    public static void showInfoOfPrisoners() {
        LoadingFileManagers.prisonerManager.showAllList();
    }

    public static void addNewPrisoner() throws IOException {
        System.out.println("Adding new prisoner: ");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the prisoner: ");
        String name = inputName.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address of the prisoner: ");
        String address = inputAddress.nextLine();

        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the id of the prisoner: ");
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

        Scanner inputCrimeLevel = new Scanner(System.in);
        System.out.println("Enter the crime level of the prisoner: ");
        String crimeLevel = inputCrimeLevel.nextLine();

        Scanner inputYearOP = new Scanner(System.in);
        System.out.println("Enter the sentence (in year) of the prisoner: ");
        int yearOP = inputYearOP.nextInt();

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

        LoadingFileManagers.prisonerManager.add(new Prisoner(name, address, id, dob, crimeLevel, yearOP, doe));

        System.out.println("Successful added!!");

    }

    public static void updateInfoPrisoner() throws IOException {
        LoadingFileManagers.prisonerManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the prisoner to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        System.out.println("Updating the information of the prisoner: ");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the prisoner: ");
        String name = inputName.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address of the prisoner: ");
        String address = inputAddress.nextLine();

        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the id of the prisoner: ");
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

        Scanner inputCrimeLevel = new Scanner(System.in);
        System.out.println("Enter the crime level of the prisoner: ");
        String crimeLevel = inputCrimeLevel.nextLine();

        Scanner inputYearOP = new Scanner(System.in);
        System.out.println("Enter the sentence (in year) of the prisoner: ");
        int yearOP = inputYearOP.nextInt();

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

        LoadingFileManagers.prisonerManager.update(choice-1 ,new Prisoner(name, address, id, dob, crimeLevel, yearOP, doe));

        System.out.println("Successful updated!!");
    }

    public static void deletePrisoner() throws IOException {
        LoadingFileManagers.prisonerManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the prisoner to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        LoadingFileManagers.prisonerManager.deleteByIndex(choice-1);

        System.out.println("Successful removed!!");
    }


    //Warden Functions
    public static void showInfoOfWardens() {
        LoadingFileManagers.wardenManager.showAllList();
    }

    public static void addNewWarden() throws IOException {
        System.out.println("Adding new warden: ");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the warden: ");
        String name = inputName.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address of the warden: ");
        String address = inputAddress.nextLine();

        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the id of the warden: ");
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

        Scanner inputPosition = new Scanner(System.in);
        System.out.println("Enter the position of the warden: ");
        String position = inputPosition.nextLine();


        System.out.println("Creating account for the warden...");


        Scanner inputUsername = new Scanner(System.in);
        System.out.println("Enter username: ");
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

        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = inputPassword.nextLine();

        Scanner inputRole = new Scanner(System.in);
        System.out.println("1. Leader");
        System.out.println("2. Staff");
        System.out.println("Enter the index of role");
        int roleChoice = inputRole.nextInt();

        AccountLevel role = AccountLevel.STAFF;
        if (roleChoice == 1) {
            role = AccountLevel.LEADER;
        }


        Account account = new Account(username, password, role, name, id);
        Warden warden = new Warden(name, address, dob, id, wsd, position, account);

        LoadingFileManagers.wardenManager.add(warden);
        LoadingFileManagers.accountManager.add(account);

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

            LoadingFileManagers.prisonManager.setWardenLeader(warden);
        }

        System.out.println("Successful added!!");

    }

    public static void updateInfoWarden() throws IOException {
        LoadingFileManagers.wardenManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the warden to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        System.out.println("Updating the information of the warden: ");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter the name of the warden: ");
        String name = inputName.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address of the warden: ");
        String address = inputAddress.nextLine();

        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter the ID of the warden: ");
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


        System.out.println("Creating account for the warden...");


        Scanner inputUsername = new Scanner(System.in);
        System.out.println("Enter username: ");
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

        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = inputPassword.nextLine();

        System.out.println();
        Scanner inputRole = new Scanner(System.in);
        System.out.println("1. Leader");
        System.out.println("2. Staff");
        System.out.println("Enter the index of role:");
        int roleChoice = inputRole.nextInt();

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

        for (int i = 0; i< LoadingFileManagers.accountManager.getAccountList().size(); i++) {
            if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == oldIdWarden) {
                LoadingFileManagers.accountManager.deleteByIndex(i);
            }
        }



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

            LoadingFileManagers.prisonManager.setWardenLeader(warden);
        }

        LoadingFileManagers.accountManager.add(account);

        System.out.println("Successful updated!!");
    }

    public static void deleteWarden() throws IOException {
        LoadingFileManagers.wardenManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the warden to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        int id = LoadingFileManagers.wardenManager.getWardenList().get(choice-1).getId();

        int index = -1;

        for (int i=0; i<LoadingFileManagers.accountManager.getAccountList().size(); i++) {
            if (LoadingFileManagers.accountManager.getAccountList().get(i).getId() == id) {
                index = i;
            }
        }

        LoadingFileManagers.accountManager.deleteByIndex(index);

        LoadingFileManagers.wardenManager.deleteByIndex(choice-1);

        boolean haveLeader = false;
        for (Account a : LoadingFileManagers.accountManager.getAccountList()) {
            if (a.getRole() == AccountLevel.LEADER) {
                haveLeader = true;
                break;
            }
        }
        if (LoadingFileManagers.wardenManager.getWardenList().size() > 0 || !haveLeader) {
            LoadingFileManagers.wardenManager.getWardenList().get(0).setPosition("Leader");
            for (Account a : LoadingFileManagers.accountManager.getAccountList()) {
                if (a.getId() == LoadingFileManagers.wardenManager.getWardenList().get(0).getId()) {
                    a.setRole(AccountLevel.LEADER);
                }
            }
        }

        System.out.println("Successful removed!!");
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
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

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
    }

    public static void deleteCellRoom() throws IOException {
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();


        LoadingFileManagers.cellRoomManager.deleteByIndex(choice-1);

        System.out.println("Successful removed!!");
    }

    public static void addPrisonerToCellRoom(){
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to add prisoner: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choiceCellRoom = choiceScanner.nextInt();

        List<Prisoner> isAdded = new ArrayList<>();
        for (CellRoom c : LoadingFileManagers.cellRoomManager.getCellRoomList()) {
            isAdded.addAll(c.getPrisoners());
        }


        for (int i = 0; i< LoadingFileManagers.prisonerManager.getPrisonerList().size(); i++) {
            if (!isAdded.contains(LoadingFileManagers.prisonerManager.getPrisonerList().get(i))) {
                System.out.println(i+1 + ". " + LoadingFileManagers.prisonerManager.getPrisonerList().get(i));
            }
        }
        System.out.println("--------------");
        System.out.println("Enter the index of the prisoner to add to the cell room: ");
        Scanner prisonerScanner = new Scanner(System.in);
        int choicePrisoner = prisonerScanner.nextInt();

        LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).addNewPrisoner(LoadingFileManagers.prisonerManager.getPrisonerList().get(choicePrisoner-1));
        System.out.println("Successful added!!");

    }

    public static void removePrisonerFromCellRoom() {
        LoadingFileManagers.cellRoomManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to add prisoner: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choiceCellRoom = choiceScanner.nextInt();

        for (int i = 0; i< LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).getPrisoners().size(); i++) {
            System.out.println(i+1 + ". " + LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).getPrisoners().get(i) );
        }

        System.out.println("--------------");
        System.out.println("Enter the index of the prisoner to remove from the cell room: ");
        Scanner prisonerScanner = new Scanner(System.in);
        int choicePrisoner = prisonerScanner.nextInt();

        LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1).getPrisoners().remove(choicePrisoner-1);
        System.out.println("Successful removed!!");
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
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to update information: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

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
    }

    public static void deleteCamp() throws IOException {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to delete: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();


        LoadingFileManagers.campManager.deleteByIndex(choice-1);

        System.out.println("Successful removed!!");
    }

    public static void addCellRoomToCamp(){
        LoadingFileManagers.campManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to add cell room: ");
        Scanner choiceScanner = new Scanner(System.in);
        int choiceCamp = choiceScanner.nextInt();

        List<CellRoom> isAdded = new ArrayList<>();
        for (Camp c : LoadingFileManagers.campManager.getCampList()) {
            isAdded.addAll(c.getCellRooms());
        }


        for (int i = 0; i< LoadingFileManagers.cellRoomManager.getCellRoomList().size(); i++) {
            if (!isAdded.contains(LoadingFileManagers.cellRoomManager.getCellRoomList().get(i))) {
                System.out.println(i+1 + ". " + LoadingFileManagers.cellRoomManager.getCellRoomList().get(i));
            }
        }
        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to add to the camp: ");
        Scanner cellRoomScanner = new Scanner(System.in);
        int choiceCellRoom = cellRoomScanner.nextInt();

        LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).addNewCellRoom(LoadingFileManagers.cellRoomManager.getCellRoomList().get(choiceCellRoom-1));
        System.out.println("Successful added!!");

    }

    public static void removeCellRoomFromCamp() {
        LoadingFileManagers.campManager.showAllList();
        System.out.println("--------------");
        System.out.println("Enter the index of the camp to add cell room: ");
        Scanner campScanner = new Scanner(System.in);
        int choiceCamp = campScanner.nextInt();

        for (int i = 0; i< LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).getCellRooms().size(); i++) {
            System.out.println(i+1 + ". " + LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).getCellRooms().get(i) );
        }

        System.out.println("--------------");
        System.out.println("Enter the index of the cell room to remove from the camp: ");
        Scanner cellRoomScanner = new Scanner(System.in);
        int choiceCellRoom = cellRoomScanner.nextInt();

        LoadingFileManagers.campManager.getCampList().get(choiceCamp-1).getCellRooms().remove(choiceCellRoom-1);
        System.out.println("Successful removed!!");
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
