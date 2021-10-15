import com.codegym.ListFilter;
import com.codegym.ListPrinter;
import com.codegym.RandomList;

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(), new ListFilter(), new ListPrinter());
        randomListFacade.printRandomEvenList(1,10,20);
    }
}
