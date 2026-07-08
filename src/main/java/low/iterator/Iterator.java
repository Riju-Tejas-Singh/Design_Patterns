package low.iterator;

/**
 * Iterator used to traverse aggregate data (SRP) without exposing its internal structure
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
