import java.net.URL;
import java.net.URLConnection;

public class FileDownloaderProxy implements Downloader{
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloader();
    }
    @Override
    public void download() {
        try {
            fileDownloader.setUserAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            fileDownloader.download();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
