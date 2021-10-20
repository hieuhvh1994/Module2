package Storage;

import Model.CellRoom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerCellRoom extends AbstractFileManager<CellRoom> {
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
        FileOutputStream fileOutputStream = new FileOutputStream("cellroom_list.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cellRooms);
        objectOutputStream.close();
        fileOutputStream.close();


    }

    @Override
    public List<CellRoom> readFile() throws IOException, ClassNotFoundException {
        File file = new File("cellroom_list.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if(file.length() > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<CellRoom> list = (List<CellRoom>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } else {
            return new ArrayList<>();
        }
    }
}
