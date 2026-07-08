package low.iterator;

import java.util.List;

public class CompanyAggregate implements CollectionAggregate<String> {

    private final List<String> names;
    public CompanyAggregate(List<String> names) {
        this.names = names;
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}
