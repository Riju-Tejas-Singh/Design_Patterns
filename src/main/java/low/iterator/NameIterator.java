package low.iterator;

import java.util.List;

/**
 * Concrete Iterator
 */
public class NameIterator implements Iterator<String> {

    private final List<String> names;
    private int currentIndex = 0;
    public NameIterator(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < names.size();
    }

    @Override
    public String next() {
        return names.get(currentIndex++);
    }
}
