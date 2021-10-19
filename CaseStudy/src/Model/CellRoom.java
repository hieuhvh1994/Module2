package Model;

import java.util.ArrayList;
import java.util.List;

public class CellRoom {
    private int number;
    private String roomLevel;
    private int numberOfBeds;
    private boolean status;
    private List<Prisoner> prisoners;


    public CellRoom(int number, String roomLevel, int numberOfBeds, boolean status) {
        this.number = number;
        this.roomLevel = roomLevel;
        this.numberOfBeds = numberOfBeds;
        this.status = status;
        this.prisoners = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(String roomLevel) {
        this.roomLevel = roomLevel;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void addNewPrisoner(Prisoner prisoner) {
        if (prisoners.size() < getNumberOfBeds()) {
            prisoners.add(prisoner);
        } else {
            System.out.println("This room is out of beds!!");
        }
    }

    @Override
    public String toString() {
        return "CellRoom{" +
                "number=" + number +
                ", roomLevel='" + roomLevel + '\'' +
                ", numberOfBeds=" + numberOfBeds +
                ", status=" + status +
                ", prisoners=" + prisoners +
                '}';
    }
}
