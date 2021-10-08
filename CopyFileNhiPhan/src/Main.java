import java.io.*;

public class Main implements Serializable {
    public static void  copyFileUsingStream(File sources, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sources);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {



        try {
            File sourceFile = new File("test.txt");
            File destFile = new File("test1.txt");

            if (!sourceFile.exists()) {
                throw new FileNotFoundException("The source file is not exist!!");
            }

            if (destFile.exists()) {
                throw new FileNotFoundException("The destination file is exist!!");
            }

            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Copy completed!!");
        } catch (IOException e) {
            System.out.printf("Can't copy that file!!");
            System.out.printf(e.getMessage());
        }

    }
}
