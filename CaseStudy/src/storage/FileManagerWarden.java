package storage;

import model.Prisoner;
import model.Warden;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerWarden implements AbstractFileManager<Warden>, Serializable {
    private static FileManagerWarden fileManagerWarden;
    private FileManagerWarden() {

    }

    public static FileManagerWarden getInstance() {
        if (fileManagerWarden == null) {
            fileManagerWarden = new FileManagerWarden();
        }
        return fileManagerWarden;
    }

    @Override
    public void writeFile(List<Warden> wardens) throws IOException {
        if (wardens == null) {
            wardens = new ArrayList<>();
        }
        File file = new File("warden_list.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(wardens);
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
    public List<Warden> readFile() throws IOException, ClassNotFoundException {
        List<Warden> wardenList = new ArrayList<>();
        File file = new File("warden_list.txt");
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
            wardenList = (List<Warden>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return wardenList;
    }
}
