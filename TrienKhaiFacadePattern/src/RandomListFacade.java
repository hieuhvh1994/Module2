import com.codegym.ListFilter;
import com.codegym.ListPrinter;
import com.codegym.RandomList;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }

    public void printRandomEvenList(int min, int max, int size) {
        listPrinter.printList( listFilter.filterOdd(randomList.generateList(size, min, max)));

    }
}
