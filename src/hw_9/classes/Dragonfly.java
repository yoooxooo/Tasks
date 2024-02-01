package hw_9.classes;

public class Dragonfly extends Animal {

    public Dragonfly (String name, int numOfLegs, boolean hasMustache) {
        super(name, numOfLegs, hasMustache);
    }

    public void voice() {
        System.out.println("bj-w-w");
    }

    public void move() {
        System.out.println("flight");
    }

    public void isHungry() {
        System.out.println("I want insects");
    }
}
