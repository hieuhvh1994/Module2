package Controller;

import Model.Camp;

import java.util.ArrayList;
import java.util.List;

public class CampManager implements IGeneralManager<Camp> {
    private List<Camp> campList = new ArrayList<>();

    @Override
    public List<Camp> findAll() {
        return campList;
    }

    @Override
    public void add(Camp camp) {
        campList.add(camp);
    }

    @Override
    public void update(Camp camp) {

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
    
}
