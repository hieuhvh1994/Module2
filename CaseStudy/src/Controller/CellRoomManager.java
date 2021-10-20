package Controller;

import Model.CellRoom;
import Model.Prisoner;

import java.util.ArrayList;
import java.util.List;

public class CellRoomManager implements IGeneralManager<CellRoom> {
    private List<CellRoom> cellRoomList = new ArrayList<>();

    public List<CellRoom> getCellRoomList() {
        return cellRoomList;
    }

    public void setCellRoomList(List<CellRoom> cellRoomList) {
        this.cellRoomList = cellRoomList;
    }

    @Override
    public List<CellRoom> findAll() {
        return cellRoomList;
    }

    @Override
    public void add(CellRoom cellRoom) {
        cellRoomList.add(cellRoom);
    }

    @Override
    public void update(int index, CellRoom cellRoom) {
        cellRoomList.set(index, cellRoom);
    }

    @Override
    public void deleteById(int index) {
        cellRoomList.remove(index);
    }

    public CellRoom searchByNumber(int number) {
        CellRoom cellRoom = null;
        for (CellRoom c : cellRoomList) {
            if (c.getNumber() == number) {
                cellRoom = c;
            }
        }
        return cellRoom;
    }

    public void searchByRoomLevel(String roomLevel) {
        CellRoom cellRoom = null;
        for (CellRoom c : cellRoomList) {
            if (c.getRoomLevel().equals(roomLevel)) {
                cellRoom = c;
                System.out.println(cellRoom);
            }
        }
    }


    @Override
    public void showAllList() {
        for (CellRoom c : cellRoomList) {
            System.out.println(c.toString());
        }
    }

    public void addNewPrisoner(Prisoner prisoner, CellRoom cellRoom) {
        for (CellRoom c : cellRoomList) {
            if (c.getNumber() == cellRoom.getNumber()) {
                c.addNewPrisoner(prisoner);
            }
        }
    }
}
