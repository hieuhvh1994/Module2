package storage;

import model.Camp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerCamp implements AbstractFileManager<Camp>{
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
        FileOutputStream fileOutputStream = new FileOutputStream("camp_list.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(camps);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public List<Camp> readFile() throws IOException, ClassNotFoundException {
        File file = new File("camp_list.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if(file.length() > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<Camp> list = (List<Camp>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } else {
            return new ArrayList<>();
        }
    }
}
