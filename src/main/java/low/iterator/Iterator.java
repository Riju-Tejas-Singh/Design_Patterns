package low.iterator;

/**
 * Iterator interface used to traverse data (SRP)
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
