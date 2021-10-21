package storage;

import authentication.Account;
import model.Camp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerAccount implements AbstractFileManager<Account>, Serializable {
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
        if (accounts == null) {
            accounts = new ArrayList<>();
        }
        File file = new File("account_list.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accounts);
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
    public List<Account> readFile() throws IOException, ClassNotFoundException {
        List<Account> accountList = new ArrayList<>();
        File file = new File("account_list.txt");
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
            accountList = (List<Account>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return accountList;
    }
}

