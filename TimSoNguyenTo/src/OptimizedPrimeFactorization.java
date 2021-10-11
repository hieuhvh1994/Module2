public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        boolean isPrime = true;
        for (int i = 3; i < 100; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Optimized: " + i);

            }
            isPrime = true;

        }
    }
}
