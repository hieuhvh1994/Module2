package storage;

import model.Camp;
import model.CellRoom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerCamp implements AbstractFileManager<Camp>, Serializable{
    private static FileManagerCamp fileManagerCamp;
    private FileManagerCamp() {

    }

    public static FileManagerCamp getInstance() {
        if (fileManagerCamp == null) {
            fileManagerCamp = new FileManagerCamp();
        }
        return fileManagerCamp;
    }
    @Override
    public void writeFile(List<Camp> camps) throws IOException {
        if (camps == null) {
            camps = new ArrayList<>();
        }
        File file = new File("camp_list.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(camps);
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
    public List<Camp> readFile() throws IOException, ClassNotFoundException {
        List<Camp> campList = new ArrayList<>();
        File file = new File("camp_list.txt");
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
            campList = (List<Camp>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return campList;
    }
}
