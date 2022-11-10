package threadsafelist;

public class ArrayIterator<E> implements java.util.Iterator<E> {

    private int index = 0;
    private final E[] array;

    ArrayIterator(E[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public E next() {
        return array[index++];
    }
}
