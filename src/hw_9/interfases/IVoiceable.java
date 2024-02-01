package hw_9.interfases;

public interface IVoiceable {

    default void voice() {
        System.out.println("voice");
    }
}
