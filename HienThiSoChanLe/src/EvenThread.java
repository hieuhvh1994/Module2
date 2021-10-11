public class EvenThread extends Thread {
    private Thread myThread;

    public EvenThread() {
        myThread = new Thread(this, "Even Thread");
        System.out.println("My thread is created " + myThread);

    }

    @Override
    public void run() {
        try {
            for (int i=1; i<=10; i++) {
                if (i%2 == 0) {
                    System.out.println(i);
                    Thread.sleep(15);
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted!!");
        }
    }
}
