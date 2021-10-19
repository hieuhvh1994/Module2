package Model;

import java.util.List;

public class Camp {
    private String name;
    private int id;
    private List<CellRoom> cellRooms;
    private Warden warden;

    public Camp(String name, int id, List<CellRoom> cellRooms, Warden warden) {
        this.name = name;
        this.id = id;
        this.cellRooms = cellRooms;
        this.warden = warden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CellRoom> getCellRooms() {
        return cellRooms;
    }

    public void setCellRooms(List<CellRoom> cellRooms) {
        this.cellRooms = cellRooms;
    }

    public Warden getWarden() {
        return warden;
    }

    public void setWarden(Warden warden) {
        this.warden = warden;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Camp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cellRooms=" + cellRooms +
                ", warden=" + warden +
                '}';
    }
}