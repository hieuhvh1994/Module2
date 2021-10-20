package storage;

import model.Prisoner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerPrisoner implements AbstractFileManager<Prisoner> {
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
        FileOutputStream fileOutputStream = new FileOutputStream("prisoner_list.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(prisoners);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public List<Prisoner> readFile() throws IOException, ClassNotFoundException {
        File file = new File("prisoner_list.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.length() > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<Prisoner> list = (List<Prisoner>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } else {
            return new ArrayList<>();
        }
    }
}
