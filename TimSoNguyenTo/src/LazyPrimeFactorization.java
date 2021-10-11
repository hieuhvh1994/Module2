public class LazyPrimeFactorization extends Thread {
    @Override
    public void run() {
        boolean isPrime = true;
        for (int i = 3; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Lazy: " +i);

            }
            isPrime = true;

        }
    }
}
