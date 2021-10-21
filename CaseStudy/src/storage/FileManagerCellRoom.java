package storage;

import model.CellRoom;
import model.Warden;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerCellRoom implements AbstractFileManager<CellRoom>, Serializable {
    private static FileManagerCellRoom fileManagerCellRoom;
    private FileManagerCellRoom() {

    }

    public static FileManagerCellRoom getInstance() {
        if (fileManagerCellRoom == null) {
            fileManagerCellRoom = new FileManagerCellRoom();
        }
        return fileManagerCellRoom;
    }



    @Override
    public void writeFile(List<CellRoom> cellRooms) throws IOException {
        if (cellRooms == null) {
            cellRooms = new ArrayList<>();
        }
        File file = new File("cellroom_list.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cellRooms);
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
    public List<CellRoom> readFile() throws IOException, ClassNotFoundException {
        List<CellRoom> cellRoomList = new ArrayList<>();
        File file = new File("cellroom_list.txt");
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
            cellRoomList = (List<CellRoom>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cellRoomList;
    }
}
