package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CellRoom implements Serializable {
    private int number;
    private int numberOfBeds;
    private List<Prisoner> prisoners;


    public CellRoom(int number, int numberOfBeds) {
        this.number = number;
        this.numberOfBeds = numberOfBeds;
        this.prisoners = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void addNewPrisoner(Prisoner prisoner) {
        if (prisoners.size() < getNumberOfBeds()) {
            prisoners.add(prisoner);
        } else {
            System.out.println("This room is out of beds!!");
        }
    }

    public List<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(List<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    @Override
    public String toString() {
        return "CellRoom: " + "\n" +
                "Room Number: " + number + "\n" +
                "Number Of Beds: " + numberOfBeds + "\n" +
                "Prisoner: " + prisoners + "\n\n";

    }
}
