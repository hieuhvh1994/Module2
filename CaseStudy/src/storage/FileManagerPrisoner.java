package storage;

import model.Prisoner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerPrisoner implements AbstractFileManager<Prisoner>, Serializable {
    private static FileManagerPrisoner fileManagerPrisoner;
    private FileManagerPrisoner() {

    }

    public static FileManagerPrisoner getInstance() {
        if (fileManagerPrisoner == null) {
            fileManagerPrisoner = new FileManagerPrisoner();
        }
        return fileManagerPrisoner;
    }

    @Override
    public void writeFile(List<Prisoner> prisoners) throws IOException {
        if (prisoners == null) {
            prisoners = new ArrayList<>();
        }
        File file = new File("prisoner_list.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(prisoners);
            oos.close();
            fos.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Prisoner> readFile() {
        List<Prisoner> prisonerList = new ArrayList<>();
        File file = new File("prisoner_list.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.length() == 0) {
            return new ArrayList<>();
        }
        try {
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            prisonerList = (List<Prisoner>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return prisonerList;
    }
}
