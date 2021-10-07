import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class CopyFileText {
    public List<Integer> readFileInputData (String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            DataInputStream din = new DataInputStream(new FileInputStream(file));

            String line = "";
            while ((line = din.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }

            din.close();

        } catch (Exception e) {
            System.err.println("File Not Found!!");
        }

        return numbers;
    }

    public void writeFileOutputData (String filePath, int charCount, List<Integer> arr) {
        try {
            File f = new File(filePath);
            DataOutputStream dout = new DataOutputStream(new FileOutputStream(f));

            for (int i =0; i<arr.size(); i++) {
                dout.write(arr.get(i));
            }

            dout.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void readFileData(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            DataInputStream din = new DataInputStream(new FileInputStream(file));

            while (true) {
                System.out.println(din.readInt());
            }

        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int charCountNum (List<Integer> numbers) {
        return numbers.size();
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<Integer> numbers = copyFileText.readFileInputData("numbers.txt");
        int charCount = charCountNum(numbers);
        copyFileText.writeFileOutputData("result.txt", charCount, numbers);
        copyFileText.readFileData("result.txt");
    }
}
