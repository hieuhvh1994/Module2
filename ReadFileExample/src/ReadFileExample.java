import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File f = new File(filePath);

            if (!f.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(f));
            String line ="";
            int sum =0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            br.close();

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
