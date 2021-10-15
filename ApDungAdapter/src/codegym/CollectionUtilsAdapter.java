package codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();

        List<Integer> list = new ArrayList<>(numbers);

        return collectionUtils.findMax(list);


    }
}
