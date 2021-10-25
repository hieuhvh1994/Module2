package view;

import storage.LoadingFileManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LoadingFileManager.loadManagementFile();
        Menu.enable();
    }
}
