import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {


    private int size = 0;
    static final int DEFAULT_CAPACITY = 0;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        elements = new Object[capacity];

    }

    private void ensureCapa(int minCapacity) {
        int newSize = elements.length +minCapacity;
        elements=Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa(1);
        }
        int i = index;
        int j = index + 1;

        while (j<size) {
            elements[j] = elements[i];
            i++;
            j++;
        }
        elements[index] = element;
        size++;

    }

    public E remove(int index) {
        E temp = (E) elements[index];
        int i = index;
        int j = index+1;

        while (j< size) {
            elements[i] = elements[j];
            i++;
            j++;
        }
        size--;

        return temp;
    }

    public int size() {
        return this.size;
    }

    public Object[] clone() {
        return Arrays.copyOf(elements, size);



    }

    public boolean contains(E o) {
        boolean result = false;
        for (int i=0; i<size; i++) {
            if (elements[i] == o) {
                result = true;
            }
        }
        return result;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i=0; i<size; i++) {
            if (elements[i] == o) {
                index = i;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa(1);
        }
        elements[size] = e;
        size++;

        return true;
    }

    public E get(int i) {
        if (i<0 || i>=size) {
            throw new IndexOutOfBoundsException("i: " + i + ", size: ");
        }
        return (E) elements[i];
    }

    public void clear() {
        while (size>0) {
            remove(0);
        }
    }


}
