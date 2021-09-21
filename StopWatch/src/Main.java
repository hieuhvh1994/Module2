public class Main {
    public static void main(String[] args) {
        StopWatch stw = new StopWatch();


        double[] arr = new double[100000];
        for (int i =0; i<arr.length;i++) {
            arr[i] = (Math.random() * 100000);
        }

        stw.start();
        int min;
        for (int i =0; i<arr.length-1; i++) {
            min = i;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            double temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;



        }
        stw.stop();

        System.out.println(stw.getElapsedTime());

    }
}
