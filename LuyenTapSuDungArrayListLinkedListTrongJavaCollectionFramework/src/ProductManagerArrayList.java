import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManagerArrayList {

    private ArrayList<Product> products = new ArrayList<>();

    public ProductManagerArrayList() {
    }

    public ProductManagerArrayList(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product p){
        products.add(p);
        return true;
    }

    public boolean searchingID(int id) {
        for (Product p: products) {
            if (p.getId() == id) {
                return true;
            }


        }
        return false;
    }

    public void searchingName(String name) {
        int index = -1;
        for (Product p: products) {
            if (p.getName() == name) {
                index = products.indexOf(p);
            }


        }
        if (index == -1) {
            System.out.println("The product is not in the list!!");
        } else {
            System.out.println("The product is at: " + index + " ," + products.get(index).toString());
        }

    }

    public void changeProduct() {
        System.out.println("List of the products: ");

        for (Product p : products) {
            System.out.println(p.toString());
        }
        System.out.println("0. Exit!");


        System.out.println("Enter the id of product to change: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        if (choice == 0) {
            System.exit(0);

        } else if (searchingID(choice) == true) {
            int index = -1;
            for (Product p : products) {
                if (p.getId() == choice) {
                    index = products.indexOf(p);
                }
            }


            System.out.println("Enter new ID: ");
            Scanner sc1 = new Scanner(System.in);
            int newId = sc1.nextInt();

            System.out.println("Enter new name: ");
            Scanner sc2 = new Scanner(System.in);
            String newName = sc2.nextLine();

            System.out.println("Enter new price: ");
            Scanner sc3 = new Scanner(System.in);
            int newPrice = sc3.nextInt();

            products.set(index, new Product(newId, newName, newPrice));

        } else {
            System.out.println("The product is not in the list!!");
        }



    }

    public void removeProduct(int id) {
        if (searchingID(id) == false) {
            System.out.println("The product is not in the list!!");
        } else {
            int index = -1;
            for (Product p : products) {
                if (p.getId() == id) {
                    index = products.indexOf(p);
                }
            }

            products.remove(index);
        }
    }

    public void sortByPriceIncrease(){
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        products.sort(productComparator);
    }

    public void sortByPriceDecrease(){
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        products.sort(productComparator);
    }

    public void displayProducts() {
        for (Product p: products) {
            System.out.println(p.toString());
        }
    }

}
