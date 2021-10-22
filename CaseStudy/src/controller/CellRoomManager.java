package controller;

import model.CellRoom;
import model.Prisoner;
import storage.FileManagerCellRoom;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Class Cell Room Manager
public class CellRoomManager implements IGeneralManager<CellRoom>, Serializable {
    private List<CellRoom> cellRoomList = new ArrayList<>();
    private FileManagerCellRoom fileManagerCellRoom;

    public List<CellRoom> getCellRoomList() {
        return cellRoomList;
    }

    public void setCellRoomList(List<CellRoom> cellRoomList) {
        this.cellRoomList = cellRoomList;
    }

    public FileManagerCellRoom getFileManagerCellRoom() {
        return fileManagerCellRoom;
    }

    public void setFileManagerCellRoom(FileManagerCellRoom fileManagerCellRoom) {
        this.fileManagerCellRoom = fileManagerCellRoom;
    }

    @Override
    public List<CellRoom> findAll() {
        return cellRoomList;
    }

    @Override
    public void add(CellRoom cellRoom) throws IOException {
        cellRoomList.add(cellRoom);
        fileManagerCellRoom.writeFile(cellRoomList);
    }

    @Override
    public void update(int index, CellRoom cellRoom) throws IOException {
        cellRoomList.set(index, cellRoom);
        fileManagerCellRoom.writeFile(cellRoomList);
    }

    @Override
    public void deleteByIndex(int index) throws IOException {
        cellRoomList.remove(index);
        fileManagerCellRoom.writeFile(cellRoomList);
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


    @Override
    public void showAllList() {
        int i = 1;
        for (CellRoom c : cellRoomList) {
            System.out.println(i + ". " + c.toString());
            i++;
        }
    }

    //Add new prisoner to Cell Room
    public void addNewPrisoner(Prisoner prisoner, CellRoom cellRoom) throws IOException {
        for (CellRoom c : cellRoomList) {
            if (c.getNumber() == cellRoom.getNumber()) {
                c.addNewPrisoner(prisoner);
            }
        }
        fileManagerCellRoom.writeFile(cellRoomList);
    }
}
