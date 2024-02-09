package hw_7.stackOverflowError;

public class Main {

    public static void endlessRecursion() {
        endlessRecursion();
    }


    public static void main(String[] args) {
        endlessRecursion();
    }
}
