package controller;

import model.Prisoner;
import storage.FileManagerPrisoner;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrisonerManager implements IGeneralManager<Prisoner>, Serializable {
    private List<Prisoner> prisonerList = new ArrayList<>();
    private FileManagerPrisoner fileManagerPrisoner;


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
    public void add(Prisoner prisoner) throws IOException {
        prisonerList.add(prisoner);
//        fileManagerPrisoner.writeFile(prisonerList);
    }

    @Override
    public void update(int index, Prisoner prisoner) throws IOException {
        prisonerList.set(index, prisoner);
        fileManagerPrisoner.writeFile(prisonerList);
    }


    @Override
    public void deleteById(int index) throws IOException {
        prisonerList.remove(index);
        fileManagerPrisoner.writeFile(prisonerList);
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

    public FileManagerPrisoner getFileManagerPrisoner() {
        return fileManagerPrisoner;
    }

    public void setFileManagerPrisoner(FileManagerPrisoner fileManagerPrisoner) {
        this.fileManagerPrisoner = fileManagerPrisoner;
    }
}
