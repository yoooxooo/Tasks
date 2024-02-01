package hw_9.classes;

public class Horse extends Animal {

    public Horse (String name, int numOfLegs, boolean hasMustache) {
        super(name, numOfLegs, hasMustache);
    }

    public void voice() {
        System.out.println("I-go-go");
    }

    public void move() {
        System.out.println("top-top");
    }

    public void isHungry() {
        System.out.println("I want hay");
    }
}
