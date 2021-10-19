package Controller;

import Model.Prisoner;

import java.util.ArrayList;
import java.util.List;

public class PrisonerManager implements IGeneralManager<Prisoner> {
    private List<Prisoner> prisonerList = new ArrayList<>();


    @Override
    public List<Prisoner> findAll() {
        return prisonerList;
    }

    @Override
    public void add(Prisoner prisoner) {
        prisonerList.add(prisoner);
    }

    @Override
    public void update(Prisoner prisoner) {
    }


    @Override
    public void deleteById(int index) {
        prisonerList.remove(index);
    }


    public Prisoner searchById(int id) {
        Prisoner prisoner = null;
        for (Prisoner p : prisonerList) {
            if (p.getId() == id) {
                prisoner = p;
            }
        }
        return prisoner;
    }


    public Prisoner searchByName(String name) {
        Prisoner prisoner = null;
        for (Prisoner p : prisonerList) {
            if (p.getName().equals(name)) {
                prisoner = p;
            }
        }
        return prisoner;
    }

    @Override
    public void showAllList() {
        for (Prisoner p : prisonerList) {
            System.out.println(p.toString());
        }
    }


}
