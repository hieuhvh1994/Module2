public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "milk", 12);
        Product p2 = new Product(2, "pork", 14);
        Product p3 = new Product(3, "beef", 15);
        Product p4 = new Product(4, "fish", 19);
        Product p5 = new Product(5, "chicken", 13);

        ProductManagerArrayList productManagerArrayList = new ProductManagerArrayList();

        productManagerArrayList.addProduct(p1);
        productManagerArrayList.addProduct(p2);
        productManagerArrayList.addProduct(p3);
        productManagerArrayList.addProduct(p4);
        productManagerArrayList.addProduct(p5);

        productManagerArrayList.displayProducts();
        System.out.println("---------------------");

//        productManagerArrayList.changeProduct();

        System.out.println("---------------------");
        productManagerArrayList.displayProducts();

        productManagerArrayList.sortByPriceDecrease();

        System.out.println("---------------------");
        productManagerArrayList.displayProducts();

        productManagerArrayList.sortByPriceIncrease();
        System.out.println("---------------------");
        productManagerArrayList.displayProducts();


        ProductManagerLinkedList productManagerLinkedList = new ProductManagerLinkedList();

        productManagerLinkedList.addProduct(p1);
        productManagerLinkedList.addProduct(p2);
        productManagerLinkedList.addProduct(p3);
        productManagerLinkedList.addProduct(p4);
        productManagerLinkedList.addProduct(p5);


        System.out.println("---------------------");
        productManagerLinkedList.displayProducts();
        System.out.println("---------------------");


    }
}
