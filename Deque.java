public interface Deque<T> {

    void addLast(T val);

    T peekLast(T val);

    T pollFirst();

    T pollLast();

    T peekFirst();

    boolean isEmpty();

    int size();


}
