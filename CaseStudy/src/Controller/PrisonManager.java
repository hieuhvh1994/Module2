package Controller;

import Model.CellRoom;
import Model.Prisoner;
import Model.Warden;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrisonManager {
    private List<CellRoom> cellRooms = new ArrayList<>();
    private List<Prisoner> prisoners = new ArrayList<>();
    private List<Warden> wardens = new ArrayList<>();

    public PrisonManager() {
    }

    public PrisonManager(List<CellRoom> cellRooms, List<Prisoner> prisoners, List<Warden> wardens) {
        this.cellRooms = cellRooms;
        this.prisoners = prisoners;
        this.wardens = wardens;
    }

    public List<CellRoom> getCellRooms() {
        return cellRooms;
    }

    public void setCellRooms(List<CellRoom> cellRooms) {
        this.cellRooms = cellRooms;
    }

    public List<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(List<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public List<Warden> getWardens() {
        return wardens;
    }

    public void setWardens(List<Warden> wardens) {
        this.wardens = wardens;
    }

    @Override
    public String toString() {
        return "PrisonManager{" +
                "cellRooms=" + cellRooms +
                ", prisoners=" + prisoners +
                ", wardens=" + wardens +
                '}';
    }

    public void addPrisoner(String name, String address, int id, LocalDate dob, String crimeLevel, int yearsInPrison, LocalDate dateOfExecution) {
        Prisoner prisoner = new Prisoner(name, address, id, dob, crimeLevel, yearsInPrison, dateOfExecution);
        prisoners.add(prisoner);
    }

    public void addCellRoom(int number, String roomLevel, int numberOfBeds, boolean status) {
        CellRoom cellRoom = new CellRoom(number, roomLevel, numberOfBeds, status);
        cellRooms.add(cellRoom);
    }

    public void addWarden(String name, String address, LocalDate dob, int id, LocalDate workingStartDate, String position) {
        Warden warden = new Warden(name, address, dob, id, workingStartDate, position);
        wardens.add(warden);
    }

    public void addNewPrisoner(Prisoner prisoner, CellRoom cellRoom) {
        for (CellRoom c : cellRooms) {
            if (c.getNumber() == cellRoom.getNumber()) {
                c.addNewPrisoner(prisoner);
            }
        }
    }






}
