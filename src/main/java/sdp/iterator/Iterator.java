package sdp.iterator;

public interface Iterator<T> {
    T first();
    T next();
    boolean hasNext();
}
