package controller;

import model.Phonebook;
import storage.FilePhonebookManager;

import java.io.IOException;
import java.util.List;

public class PhonebookManager implements IGeneralManager<Phonebook> {
    List<Phonebook> phonebookList;
    FilePhonebookManager filePhonebookManager;

    public PhonebookManager() {
    }

    public PhonebookManager(List<Phonebook> phonebookList) {
        this.phonebookList = phonebookList;
    }

    public List<Phonebook> getPhonebookList() {
        return phonebookList;
    }

    public void setPhonebookList(List<Phonebook> phonebookList) {
        this.phonebookList = phonebookList;
    }

    public FilePhonebookManager getFilePhonebookManager() {
        return filePhonebookManager;
    }

    public void setFilePhonebookManager(FilePhonebookManager filePhonebookManager) {
        this.filePhonebookManager = filePhonebookManager;
    }

    @Override
    public String toString() {
        return "PhonebookManager{" +
                "phonebookList=" + phonebookList +
                '}';
    }

    @Override
    public List<Phonebook> findAll() {
        return phonebookList;
    }

    @Override
    public void add(Phonebook phonebook) throws IOException {
        phonebookList.add(phonebook);
    }

    @Override
    public void update(int index, Phonebook phonebook) throws IOException {
        phonebookList.set(index, phonebook);
    }

    @Override
    public void deleteByIndex(int index) throws IOException {
        phonebookList.remove(index);
    }

    @Override
    public void showAllList() {
        int i = 1;
        for (Phonebook phonebook : phonebookList) {
            System.out.println(i + ". " + phonebook.toString());
        }

    }
}
