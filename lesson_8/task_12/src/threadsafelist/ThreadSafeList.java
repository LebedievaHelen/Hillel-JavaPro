package threadsafelist;

public class ThreadSafeList<E> implements MyList<E> {

    /* private final MyList<E> list = new ThreadSafeList<>();*/

    private E[] array;

    public ThreadSafeList() {
        array = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        synchronized (ThreadSafeList.this) {
            try {
                E[] newArray = array;
                array = (E[]) new Object[newArray.length + 1];
                System.arraycopy(newArray, 0, array, 0, newArray.length);
                array[array.length - 1] = e;
                return true;
            } catch (ClassCastException ex) {
                ex.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public boolean remove(E o) {
        synchronized (ThreadSafeList.this) {
            try {
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals(o)) {
                        E[] newArray = array;
                        array = (E[]) new Object[newArray.length - 1];
                        System.arraycopy(newArray, 0, array, 0, i);
                        int elementAmount = newArray.length - i - 1;
                        System.arraycopy(newArray, i + 1, array, i, elementAmount);
                        return true;
                    }
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public E get(int index) {
        synchronized (ThreadSafeList.this) {
            if (index < array.length) {
                return array[index];
            } else {
                throw new IndexOutOfBoundsException("Index " + index + "greater then " + array.length);
            }
        }
    }

    @Override
    public java.util.Iterator iterator() {
        return new ArrayIterator<>(array);
    }
}




