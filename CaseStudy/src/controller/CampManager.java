package controller;

import model.Camp;
import model.CellRoom;
import storage.FileManagerCamp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CampManager implements IGeneralManager<Camp>, Serializable {
    private List<Camp> campList = new ArrayList<>();
    private FileManagerCamp fileManagerCamp;

    public List<Camp> getCampList() {
        return campList;
    }

    public void setCampList(List<Camp> campList) {
        this.campList = campList;
    }

    public FileManagerCamp getFileManagerCamp() {
        return fileManagerCamp;
    }

    public void setFileManagerCamp(FileManagerCamp fileManagerCamp) {
        this.fileManagerCamp = fileManagerCamp;
    }

    @Override
    public List<Camp> findAll() {
        return campList;
    }

    @Override
    public void add(Camp camp) throws IOException {
        campList.add(camp);
        fileManagerCamp.writeFile(campList);

    }

    @Override
    public void update(int index, Camp camp) throws IOException {
        campList.set(index, camp);
        fileManagerCamp.writeFile(campList);
    }

    @Override
    public void deleteByIndex(int index) throws IOException {
        campList.remove(campList.get(index));
        fileManagerCamp.writeFile(campList);
    }

    @Override
    public void showAllList() {
        int i = 1;
        for (Camp c : campList) {
            System.out.println(i + ". " + c.toString());
        }
    }

    public void addNewCellRoom(CellRoom cellRoom, Camp camp) throws IOException {
        for (Camp c : campList) {
            if (c.getId() == camp.getId()) {
                c.addNewCellRoom(cellRoom);
            }
        }
        fileManagerCamp.writeFile(campList);
    }



}
