package controller;

import model.Warden;
import storage.FileManagerWarden;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WardenManager implements IGeneralManager<Warden>, Serializable {
    private List<Warden> wardenList;
    private FileManagerWarden fileManagerWarden;

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
    public void add(Warden warden) throws IOException {
        wardenList.add(warden);
        fileManagerWarden.writeFile(wardenList);
    }

    @Override
    public void update(int index, Warden warden) throws IOException {
        wardenList.set(index, warden);
        fileManagerWarden.writeFile(wardenList);

    }

    @Override
    public void deleteByIndex(int index) throws IOException {
        wardenList.remove(index);
        fileManagerWarden.writeFile(wardenList);
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
        int i = 1;
        for (Warden w : wardenList) {
            System.out.println(i + ". " + w.toString());
            i++;
        }
    }

    public FileManagerWarden getFileManagerWarden() {
        return fileManagerWarden;
    }

    public void setFileManagerWarden(FileManagerWarden fileManagerWarden) {
        this.fileManagerWarden = fileManagerWarden;
    }
}
