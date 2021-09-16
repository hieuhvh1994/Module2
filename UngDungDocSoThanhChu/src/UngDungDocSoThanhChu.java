import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();

        String[] inputArr = input.split("");

        switch (inputArr.length) {
            case 1:
                if (inputArr[0].equals("0")) {
                    System.out.println("Zero");
                } else {
                    System.out.println(tenDown(inputArr[0]));
                }
                break;

            case 2:
                System.out.println(tenUp(inputArr[0], tenDown(inputArr[1])));
                break;

            case 3:
                if ((inputArr[1].equals("0")) && (inputArr[2].equals("0"))) {
                    System.out.println(hundredUp(inputArr[0]));
                } else {
                    System.out.println(hundredUp(inputArr[0]));
                    System.out.println(" and " + tenUp(inputArr[1], tenDown(inputArr[2])) + "\n");
                }
        }


    }

    private static String tenDown(String number) {
        switch (number) {
            case "0":
                return "Zero";

            case "1":
                return "One";

            case "2":
                return "Two";

            case "3":
                return "Three";

            case "4":
                return "Four";

            case "5":
                return "Five";

            case "6":
                return "Six";

            case "7":
                return "Seven";

            case "8":
                return "Eight";

            case "9":
                return "Nine";

            default:
                return "Out of Ability";


        }

    }

    private static String tenUp(String number, String previous) {
        switch (number) {
            case "0":
                return previous;
            case "1":
                switch (previous) {
                    case "Zero":
                        return "ten";
                    case "one":
                        return "eleven";
                    case "two":
                        return "twelve";
                    case "three":
                        return "thirteen";
                    default:
                        return previous + "teen";
                }
            case "2":
                return "twenty " + previous;
            case "3":
                return "thirty " + previous;
            default:
                return tenDown(number) + "ty" + " " + previous;

        }
    }

    private static String hundredUp(String number) {
        return tenDown(number) + " hundred";
    }
}
