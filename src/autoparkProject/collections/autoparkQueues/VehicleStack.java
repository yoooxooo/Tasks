package autoparkProject.collections.autoparkQueues;

import hw_11.classes.Person;

import java.util.Arrays;

public class VehicleStack<T> {

    private Object[] array;

    private int length = 16;

    private int size = 0;

    public VehicleStack() {
        array = new Object[length];
    }

    public void push(T obj) {
        if (array[length - 1] != null) {
            length = length * 3/2;
            array = Arrays.copyOf(array, length);
        }
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                array[i] = obj;
                size++;
                break;
            }
        }
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        for (int i = length - 1; i >= 0; i--) {
            if (array[i] != null) {
                @SuppressWarnings("unchecked")
                T buff = (T) array[i];
                array[i] = null;
                size--;
                return buff;
            }
        }
        return null;
    }

    public T peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        for (int i = length - 1; i > 0; i--) {
            if (array[i] != null) {
                @SuppressWarnings("unchecked")
                T buff = (T) array[i];
                return buff;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }
}

