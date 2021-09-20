import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element which is needed to be added: ");
        int X = input.nextInt();

        System.out.println("Enter the position of the element which will be added: ");
        int pos = input.nextInt();

        System.out.println(X + " is added!!");

        int[] new_arr = new int[arr.length+1];

        for (int j=0; j<pos; j++) {
            new_arr[j] = arr[j];
        }

        new_arr[pos] = X;

        for (int k = pos; k<arr.length; k++ ) {
            new_arr[k+1] = arr[k];
        }

        for (int l = 0; l<new_arr.length; l++) {
               System.out.print(new_arr[l] + "\t");
        }
    }
    
}

