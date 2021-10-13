import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm#dt_source=&dt_campaign=MenuMain&dt_medium=4");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\\\R", "");

            content = content.replaceAll("\\\\n+", "");




            Pattern p = Pattern.compile("title=\"(.*?)\"><div");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
