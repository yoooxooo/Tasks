package hw_9.classes;

import hw_9.interfases.IMovable;
import hw_9.interfases.IStarveble;
import hw_9.interfases.IVoiceable;

public abstract class Animal implements IMovable, IStarveble, IVoiceable {

    private String name;

    private int numOfLegs;

    private boolean hasMustache;

    public Animal() {
    }

    public Animal(String name, int numOfLegs, boolean hasMustache) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.hasMustache = hasMustache;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
