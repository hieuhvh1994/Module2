import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download() {
        try {
            URL url = new URL("https://web.hn.ss.bfcplatform.vn/muadienmay/content/article2/0878913035-1620532649.jpg");
            URLConnection ucon = url.openConnection();
            ucon.setRequestProperty("User-Agent", userAgent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
