package codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(7);
        set.add(6);

        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(set);

    }
}
