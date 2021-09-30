import java.util.LinkedList;

public class MyLinkedTest {
    public static void main(String[] args) {

        MyLinkedList<Integer> listInteger = new MyLinkedList<>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);


        for (int i=0; i<listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }

        listInteger.remove(3);

        System.out.println("\n");
        for (int i=0; i<listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }

        listInteger.add(3, 4);
        System.out.println("\n");
        for (int i=0; i<listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }
        


    }
}
