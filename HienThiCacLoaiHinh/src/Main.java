import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice !=4) {
            System.out.println("");
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter the width of the rectangle: ");
                    int widthRect = input1.nextInt();
                    System.out.println("Enter the height of the rectangle: ");
                    int heightRect = input1.nextInt();

                    for (int i=0; i<heightRect; i++) {
                        System.out.println("");
                        for (int j=0; j<widthRect; j++) {
                            System.out.print(" * ");
                        }

                    }

                    break;

                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter the width of the triangle: ");
                    int widthTriangle = input2.nextInt();

                    int choiceCorner = -1;
                    while (choiceCorner != 1 && choiceCorner !=2 && choiceCorner != 3 && choiceCorner != 4) {
                        System.out.println("Choose the corner square: ");
                        System.out.println("1. Top-left.");
                        System.out.println("2. Top-right.");
                        System.out.println("3. Bottom-left.");
                        System.out.println("4. Bottom-right.");
                        System.out.println("Enter your choice: ");
                        choiceCorner = input2.nextInt();
                    }

                    switch (choiceCorner) {
                        case 1:
                            for (int i=widthTriangle; i>=1; i--) {
                                System.out.println("");
                                for (int j=0; j<i; j++) {
                                    System.out.print(" * ");
                                }

                            }

                            break;

                        case 2:
                            for (int i=widthTriangle; i>=1; i--) {
                                System.out.println("");
                                for (int j=0; j<widthTriangle-i; j++) {
                                    System.out.print("   ");
                                }
                                for (int k=0; k<i; k++) {
                                    System.out.print(" * ");
                                }

                            }
                            break;

                        case 3:
                            for (int i=1; i<widthTriangle+1; i++) {
                                System.out.println("");
                                for (int k=0; k<i; k++) {
                                    System.out.print(" * ");
                                }

                            }
                            break;


                        case 4:
                            for (int i=widthTriangle; i>=1; i--) {
                                for (int j=i-1; j>0; j--) {
                                    System.out.print("   ");
                                }
                                for (int k=widthTriangle-i; k>=0; k--) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");

                            }
                            break;

                        default:
                            System.out.println("No choice!");

                    }



                    break;


                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Enter the width of the triangle: ");
                    int widthIsoscelesTriangle = input3.nextInt();

                    for (int i=widthIsoscelesTriangle; i>=1; i--) {
                        for (int j=i-1; j>0; j--) {
                            System.out.print("  ");
                        }
                        for (int k=widthIsoscelesTriangle-i; k>=0; k--) {
                            System.out.print(" * ");
                        }
                        System.out.println("");

                    }
                    break;

                case 4:
                    System.exit(0);


                default:
                    System.out.println("No Choice!");
            }



        }

    }
}
