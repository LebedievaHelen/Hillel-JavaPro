package threadsafelist;

public interface MyList<E> extends Iterable<E> {

    boolean add(E e);

    boolean remove(E o);

    E get(int index);
}