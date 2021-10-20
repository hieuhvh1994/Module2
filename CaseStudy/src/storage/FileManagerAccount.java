package storage;

import authentication.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerAccount implements AbstractFileManager<Account> {
    private static FileManagerAccount fileManagerAccount;
    private FileManagerAccount() {

    }

    public static FileManagerAccount getInstance() {
        if (fileManagerAccount == null) {
            fileManagerAccount = new FileManagerAccount();
        }
        return fileManagerAccount;
    }

    @Override
    public void writeFile(List<Account> accounts) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("account_list.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(accounts);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public List<Account> readFile() throws IOException, ClassNotFoundException {
        File file = new File("account_list.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if(file.length() > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<Account> list = (List<Account>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } else {
            return new ArrayList<>();
        }
    }
}

