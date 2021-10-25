package storage;

import java.io.IOException;
import java.util.List;

public interface IFileManager<T> {
    public void writeFile(List<T> list) throws IOException;
    public List<T> readFile() throws IOException, ClassNotFoundException;
}
