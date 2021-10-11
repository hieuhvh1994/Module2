public class NumberGenerator implements Runnable {
    private Thread myThread;


    public NumberGenerator() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread is created " + myThread);
        myThread.start();
    }


    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println(i +", " + myThread.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
