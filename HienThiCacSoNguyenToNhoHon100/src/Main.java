public class Main {
    public static void main(String[] args) {
        int length = 99;

        int count = 0;
        int N = 2;


        while (count != length) {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check) {
                System.out.println(N);
            }
            N++;
            count++;

        }
    }
}
