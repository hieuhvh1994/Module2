package view;

import authentication.Account;
import authentication.AccountLevel;
import controller.AccountManager;
import controller.CellRoomManager;
import controller.PrisonerManager;
import controller.WardenManager;
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


        Account account1 = new Account("dinhtrong", "123", AccountLevel.LEADER, "Nguyen Dinh Trong", 12345);
        Warden w1 = new Warden("Trong", "Hanoi", (LocalDate.of(1994, 12, 9)), 123, (LocalDate.of(2010, 1, 26)) , "Leader", account1);
        Prisoner p1 = new Prisoner("Phuc", "Quang Ngai", 111, (LocalDate.of(1994, 12, 9)), "A", 2, (LocalDate.of(2010, 1, 26)));
        CellRoom c1 = new CellRoom(101, "B", 4, true);

//        WardenManager wm = new WardenManager();
//        wm.add(w1);
//        wm.showAllList();

        LoadingFileManagers.wardenManager.add(w1);
        LoadingFileManagers.prisonerManager.add(p1);
        LoadingFileManagers.cellRoomManager.add(c1);
        LoadingFileManagers.accountManager.add(account1);




//
//        cm.addNewPrisoner(p1, c1);
//
//        Camp camp1 = new Camp("A", 12, cm.getCellRoomList(), w1);
//        CampManager campM = new CampManager();
//
//        campM.add(camp1);
//
//
//
//        PrisonManager p = new PrisonManager("Nghe An", campM.getCampList(), w1);
//
//        System.out.println(p.getCamps().get(0).getCellRooms().toString());



//        System.out.println("THANH XUAN PRISON MANAGEMENT SYSTEM");
//        System.out.println("------------------------------------");
//        MainLoginMenu.enable();




    }
}
