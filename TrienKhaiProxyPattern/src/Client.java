public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy proxy = new FileDownloaderProxy();
        proxy.download();
        System.out.println("Download Complete!!");
    }
}
