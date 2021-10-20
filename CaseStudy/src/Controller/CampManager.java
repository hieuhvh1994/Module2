package Controller;

import Model.Camp;
import Model.CellRoom;

import java.util.ArrayList;
import java.util.List;

public class CampManager implements IGeneralManager<Camp> {
    private List<Camp> campList = new ArrayList<>();

    public List<Camp> getCampList() {
        return campList;
    }

    public void setCampList(List<Camp> campList) {
        this.campList = campList;
    }

    @Override
    public List<Camp> findAll() {
        return campList;
    }

    @Override
    public void add(Camp camp) {
        campList.add(camp);
    }

    @Override
    public void update(int index, Camp camp) {
        campList.set(index, camp);
    }

    @Override
    public void deleteById(int index) {
        campList.remove(campList.get(index));
    }

    @Override
    public void showAllList() {
        for (Camp c : campList) {
            System.out.println(c.toString());
        }
    }

    public void addNewCellRoom(CellRoom cellRoom, Camp camp) {
        for (Camp c : campList) {
            if (c.getId() == camp.getId()) {
                c.addNewCellRoom(cellRoom);
            }
        }
    }

}
