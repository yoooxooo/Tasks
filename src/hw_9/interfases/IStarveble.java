package hw_9.interfases;

public interface IStarveble {

    default void isHungry() {
        System.out.println("not hungry");
    }
}
