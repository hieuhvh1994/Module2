import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of USD: ");
        usd = sc.nextDouble();
        double vnd = usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
