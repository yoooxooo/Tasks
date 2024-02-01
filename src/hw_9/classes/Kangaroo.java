package hw_9.classes;

public class Kangaroo extends Animal {

    public Kangaroo (String name, int numOfLegs, boolean hasMustache) {
        super(name, numOfLegs, hasMustache);
    }

    public void voice() {
        System.out.println("khe-khe");
    }

    public void move() {
        System.out.println("jump-jump");
    }

    public void isHungry() {
        System.out.println("I want berries");
    }
}
