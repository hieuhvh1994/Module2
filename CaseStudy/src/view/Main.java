package view;

import authentication.Account;
import controller.*;
import model.*;
import storage.*;

import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Warden w1 = new Warden("Trong", "Hanoi", (LocalDate.of(1994, 12, 9)), 123, (LocalDate.of(2010, 1, 26)) , "Leader");
//        Prisoner p1 = new Prisoner("Phuc", "Quang Ngai", 111, (LocalDate.of(1994, 12, 9)), "A", 2, (LocalDate.of(2010, 1, 26)));
//        CellRoom c1 = new CellRoom(101, "B", 4, true);
//
//        WardenManager wm = new WardenManager();
//        PrisonerManager pm = new PrisonerManager();
//        CellRoomManager cm = new CellRoomManager();
//
//        wm.add(w1);
//        pm.add(p1);
//        cm.add(c1);
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



        System.out.println("THANH XUAN PRISON MANAGEMENT SYSTEM");
        System.out.println("------------------------------------");
        MainLoginMenu.mainLoginMenu();




    }
}
