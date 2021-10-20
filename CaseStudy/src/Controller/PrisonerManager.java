package Controller;

import Model.Prisoner;

import java.util.ArrayList;
import java.util.List;

public class PrisonerManager implements IGeneralManager<Prisoner> {
    private List<Prisoner> prisonerList = new ArrayList<>();


    public List<Prisoner> getPrisonerList() {
        return prisonerList;
    }

    public void setPrisonerList(List<Prisoner> prisonerList) {
        this.prisonerList = prisonerList;
    }

    @Override
    public List<Prisoner> findAll() {
        return prisonerList;
    }

    @Override
    public void add(Prisoner prisoner) {
        prisonerList.add(prisoner);
    }

    @Override
    public void update(int index, Prisoner prisoner) {
        prisonerList.set(index, prisoner);
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
