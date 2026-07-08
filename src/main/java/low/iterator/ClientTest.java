package low.iterator;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        CollectionAggregate<String> aggregate = new CompanyAggregate(names);
        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    //    a
    //    b
    //    c
}
