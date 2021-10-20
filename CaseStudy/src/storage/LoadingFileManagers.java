package storage;

import authentication.Account;
import model.Camp;
import model.CellRoom;
import model.Prisoner;
import model.Warden;

import java.io.IOException;
import java.util.List;

public class LoadingFileManagers {
    public static List<Prisoner> prisoners = null;
    public static List<Warden> wardens = null;
    public static List<CellRoom> cellRooms = null;
    public static List<Camp> camps = null;
    public static List<Account> accounts = null;
    public static FileManagerPrisoner fileManagerPrisoner = FileManagerPrisoner.getInstance();
    public static FileManagerWarden fileManagerWarden = FileManagerWarden.getInstance();
    public static FileManagerCellRoom fileManagerCellRoom = FileManagerCellRoom.getInstance();
    public static FileManagerAccount fileManagerAccount = FileManagerAccount.getInstance();
    public static FileManagerCamp fileManagerCamp = FileManagerCamp.getInstance();


    public static void loadManagementFiles() {

        try {
            prisoners = fileManagerPrisoner.readFile();
            wardens = fileManagerWarden.readFile();
            cellRooms = fileManagerCellRoom.readFile();
            camps = fileManagerCamp.readFile();
            accounts = fileManagerAccount.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
