public class OddThread extends Thread {
    private Thread myThread;

    public OddThread() {
        myThread = new Thread(this, "Odd Thread");
        System.out.println("My thread is created " + myThread);
    }

    @Override
    public void run() {
        try {
            for (int i=1; i<=10; i++) {
                if (i%2 == 1) {
                    System.out.println(i);
                    Thread.sleep(10);
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted!!");
        }
    }
}
