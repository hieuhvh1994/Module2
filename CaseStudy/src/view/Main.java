package view;

import authentication.Account;
import authentication.AccountLevel;
import controller.AccountManager;
import controller.CellRoomManager;
import controller.PrisonerManager;
import controller.WardenManager;
import model.Camp;
import model.CellRoom;
import model.Prisoner;
import model.Warden;
import storage.LoadingFileManagers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        LoadingFileManagers.loadManagementFiles();


//        Account account1 = new Account("dinhtrong", "123", AccountLevel.LEADER, "Nguyen Dinh Trong", 123);
//        Account account2 = new Account("hoanghuong", "123", AccountLevel.STAFF, "Tran Hoang Huong", 143);
//        Warden w1 = new Warden("Trong", "Hanoi", (LocalDate.of(1994, 12, 9)), 123, (LocalDate.of(2010, 1, 26)) , "Leader", account1);
//        Prisoner p1 = new Prisoner("Phuc", "Quang Ngai", 111, (LocalDate.of(1994, 12, 9)), "A", 2, (LocalDate.of(2010, 1, 26)));
//        CellRoom c1 = new CellRoom(101, 4);
//        Warden w2 = new Warden("Hoang", "Bac Ninh", (LocalDate.of(1994, 12, 9)), 143, (LocalDate.of(2010, 1, 26)) , "Staff", account2);
//        Camp camp1 = new Camp("A", 222, LoadingFileManagers.cellRoomManager.getCellRoomList(), w2);
//
//        c1.addNewPrisoner(p1);
//        camp1.addNewCellRoom(c1);
//        camp1.setWarden(w2);
//
//        LoadingFileManagers.wardenManager.add(w1);
//        LoadingFileManagers.wardenManager.add(w2);
//        LoadingFileManagers.prisonerManager.add(p1);
//        LoadingFileManagers.cellRoomManager.add(c1);
//        LoadingFileManagers.accountManager.add(account1);
//        LoadingFileManagers.campManager.add(camp1);
//
//        LoadingFileManagers.prisonManager.setCamps(LoadingFileManagers.campManager.getCampList());
//        LoadingFileManagers.prisonManager.setWardenLeader(w1);
//        LoadingFileManagers.prisonManager.setName("Thanh Xuan");
//
//        System.out.println(LoadingFileManagers.prisonManager.toString());



        System.out.println("THANH XUAN PRISON MANAGEMENT SYSTEM");
        System.out.println("------------------------------------");
        MainLoginMenu.enable();




    }
}
