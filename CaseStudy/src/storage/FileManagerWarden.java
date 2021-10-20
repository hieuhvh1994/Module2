package storage;

import model.Warden;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerWarden implements AbstractFileManager<Warden> {
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
        FileOutputStream fileOutputStream = new FileOutputStream("warden_list.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(wardens);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public List<Warden> readFile() throws IOException, ClassNotFoundException {
        File file = new File("warden_list.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.length() > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<Warden> list = (List<Warden>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } else {
            return new ArrayList<>();
        }
    }
}
