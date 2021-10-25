package storage;

import controller.PhonebookManager;
import model.Phonebook;

import java.io.IOException;
import java.util.List;

public class LoadingFileManager {
    public static List<Phonebook> phonebooks = null;
    public static FilePhonebookManager filePhonebookManager = FilePhonebookManager.getInstance();
    public static PhonebookManager phonebookManager = new PhonebookManager();

    public static void loadManagementFile() {
        try {
            phonebooks = filePhonebookManager.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        phonebookManager.setPhonebookList(phonebooks);
        phonebookManager.setFilePhonebookManager(filePhonebookManager);


    }
}
