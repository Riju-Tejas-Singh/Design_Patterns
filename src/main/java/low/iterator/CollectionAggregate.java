package low.iterator;

/**
 * Aggregate interface used to store data (SRP) and create iterator which traverses it
 */
public interface CollectionAggregate<T> {
    Iterator<T> createIterator();
}
