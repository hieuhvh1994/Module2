package Controller;

import Model.Warden;

import java.util.ArrayList;
import java.util.List;

public class WardenManager implements IGeneralManager<Warden> {
    private List<Warden> wardenList = new ArrayList<>();

    public List<Warden> getWardenList() {
        return wardenList;
    }

    public void setWardenList(List<Warden> wardenList) {
        this.wardenList = wardenList;
    }

    @Override
    public List<Warden> findAll() {
        return wardenList;
    }

    @Override
    public void add(Warden warden) {
        wardenList.add(warden);
    }

    @Override
    public void update(Warden warden) {

    }

    @Override
    public void deleteById(int index) {
        wardenList.remove(index);
    }

    public Warden searchById(int id) {
        Warden warden = null;
        for (Warden w : wardenList) {
            if (w.getId() == id) {
                warden = w;
            }
        }
        return warden;
    }


    public Warden searchByName(String name) {
        Warden warden = null;
        for (Warden w : wardenList) {
            if (w.getName().equals(name)) {
                warden = w;
            }
        }
        return warden;
    }

    @Override
    public void showAllList() {
        for (Warden w : wardenList) {
            System.out.println(w.toString());
        }
    }

}
