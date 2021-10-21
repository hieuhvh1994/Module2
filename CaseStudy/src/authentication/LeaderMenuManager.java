package authentication;

import storage.LoadingFileManagers;

public class LeaderMenuManager {
    public static void showInfoOfPrisoners() {
        LoadingFileManagers.prisonerManager.showAllList();
    }
}
