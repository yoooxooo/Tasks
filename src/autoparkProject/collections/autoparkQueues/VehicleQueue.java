package autoparkProject.collections.autoparkQueues;

import java.util.*;

public class VehicleQueue<T> {

    private Object[] array;

    private int length = 16;

    private int size = 0;

    public VehicleQueue() {
        array = new Object[length];
    }

    public void enqueue(T obj) {
        if (array[length - 1] != null) {
            length = length * 3/2;
            array = Arrays.copyOf(array, length);
        }
        for (int i = length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = obj;
        size++;
    }

    public T dequeue() {
        for (int i = length - 1; i >= 0; i--) {
            if (array[i] != null) {
                @SuppressWarnings("unchecked")
                T buff = (T) array[i];
                array[i] = null;
                size--;
                return buff;
            }
        }
        throw new IllegalStateException();
    }

    public T peek() {
        for (int i = length - 1; i >= 0; i--) {
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
