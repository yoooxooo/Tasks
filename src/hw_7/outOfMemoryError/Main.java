package hw_7.outOfMemoryError;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<byte[]> list = new LinkedList<>();

        while (true) {
            byte[] b = new byte[10 * 1024 * 1024];
            list.add(b);
        }
    }
}
