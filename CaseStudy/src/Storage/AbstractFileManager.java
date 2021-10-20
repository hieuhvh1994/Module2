package Storage;

import java.io.IOException;
import java.util.List;

public abstract class AbstractFileManager<T> {
    public abstract void writeFile(List<T> list) throws IOException;
    public abstract List<T> readFile() throws IOException, ClassNotFoundException;
}
