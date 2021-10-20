package storage;

import authentication.Account;
import model.Camp;
import model.CellRoom;
import model.Prisoner;
import model.Warden;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadingFileManagers {
    public static List<Prisoner> prisoners = null;
    public static List<Warden> wardens = null;
    public static List<CellRoom> cellRooms = null;
    public static List<Camp> camps = null;
    public static List<Account> accounts = null;

    public static void loadManagementFiles() {
        FileManagerPrisoner fileManagerPrisoner = FileManagerPrisoner.getInstance();
        try {
            prisoners = fileManagerPrisoner.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FileManagerWarden fileManagerWarden = FileManagerWarden.getInstance();
        try {
            wardens = fileManagerWarden.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        FileManagerCellRoom fileManagerCellRoom = FileManagerCellRoom.getInstance();
        try {
            cellRooms = fileManagerCellRoom.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FileManagerCamp fileManagerCamp = FileManagerCamp.getInstance();
        try {
            camps = fileManagerCamp.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FileManagerAccount fileManagerAccount = FileManagerAccount.getInstance();
        try {
            accounts = fileManagerAccount.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
