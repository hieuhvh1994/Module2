public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(6);

        for (int i=0; i<listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + " ");
        }

        listInteger.remove(2);
        System.out.println("\n");


        for (int i=0; i<listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + " ");
        }

        Object[] newInteger = new Object[listInteger.size()];
        newInteger = listInteger.clone();

        System.out.println("\n");

        for (int i =0; i<newInteger.length; i++) {
            System.out.print(newInteger[i] + " ");
        }

        System.out.println("\n");
        System.out.println(listInteger.contains(3));

        System.out.println("\n");
        System.out.println(listInteger.contains(7));

        listInteger.clear();

        System.out.println("\n");
        for (int i=0; i<listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + " ");
        }

        System.out.println("\n");
        System.out.println(listInteger.size());

    }
}
