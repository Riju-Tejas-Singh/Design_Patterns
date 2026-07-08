package low.iterator;

/**
 * Aggregate interface used to store data (SRP)
 * Contains method to create iterator
 */
public interface CollectionAggregate<T> {
    Iterator<T> createIterator();
}
