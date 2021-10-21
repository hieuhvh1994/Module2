package storage;

import authentication.Account;
import controller.*;
import model.Camp;
import model.CellRoom;
import model.Prisoner;
import model.Warden;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class LoadingFileManagers implements Serializable {
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
    public static AccountManager accountManager = new AccountManager();
    public static PrisonerManager prisonerManager = new PrisonerManager();
    public static WardenManager wardenManager = new WardenManager();
    public static CellRoomManager cellRoomManager = new CellRoomManager();
    public static CampManager campManager = new CampManager();
    public static PrisonManager prisonManager = new PrisonManager();

    public static Account loggingAccount = null;



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

        accountManager.setAccountList(accounts);
        accountManager.setFileManagerAccount(fileManagerAccount);

        prisonerManager.setPrisonerList(prisoners);
        prisonerManager.setFileManagerPrisoner(fileManagerPrisoner);

        wardenManager.setWardenList(wardens);
        wardenManager.setFileManagerWarden(fileManagerWarden);

        cellRoomManager.setCellRoomList(cellRooms);
        cellRoomManager.setFileManagerCellRoom(fileManagerCellRoom);

        campManager.setCampList(camps);
        campManager.setFileManagerCamp(fileManagerCamp);

        prisonManager.setCamps(camps);
    }


}
