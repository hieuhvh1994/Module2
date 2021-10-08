import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;

    }

    public static void addProduct() {
        String path = "product.txt";

        List<Product> products = readDataFromFile(path);
        for (Product product: products) {
            System.out.println(product);
        }


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter new ID: ");
        int newId = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String newName = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter new manufacture: ");
        String newManufacturer = sc3.nextLine();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter new price: ");
        int newPrice = sc4.nextInt();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter new description: ");
        String newDescription = sc5.nextLine();

        products.add(new Product(newId, newName, newManufacturer, newPrice, newDescription));

        writeToFile(path, products);

        for (Product product: products) {
            System.out.println(product);
        }


    }

    public static void searchProduct(String name) {
        String path = "product.txt";

        List<Product> products = readDataFromFile(path);
        for (Product product: products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }

        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        products.add(new Product(1, "Milk", "Vinamilk", 20000, "Plain"));
        products.add(new Product(2, "Pork", "CP", 60000, "Bacon"));
        products.add(new Product(3, "Beef", "Xuan Huong", 80000, "Jerky"));
        products.add(new Product(4, "Beer", "Halida", 30000, "Black"));
        products.add(new Product(5, "Sochu", "CJ", 75000, "Alcohol"));
        writeToFile("product.txt", products);


//        addProduct();

        searchProduct("Beer");

    }
}
