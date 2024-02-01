package hw_9.interfases;

public interface IMovable {

    default void move() {
        System.out.println("movement");
    }
}
