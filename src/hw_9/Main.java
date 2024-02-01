package hw_9;

import hw_9.classes.Animal;
import hw_9.classes.Dragonfly;
import hw_9.classes.Horse;
import hw_9.classes.Kangaroo;

public class Main {
    public static void main(String[] args) {
        Animal[] herd = new Animal[7];
        herd[0] = new Horse("Horse", 4, false);
        herd[1] = new Horse("Horse", 4, false);
        herd[2] = new Kangaroo("Kangaroo", 4, true);
        herd[3] = new Kangaroo("Kangaroo", 4, true);
        herd[4] = new Dragonfly("Dragonfly", 6, true);
        herd[5] = new Dragonfly("Dragonfly", 6, true);
        herd[6] = new Animal("Unknown type", 10, true) {};

        Horse horse = new Horse("Horse", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly", 6, true);

        for (Animal animal: herd) {
            animal.voice();
        }
        horse.voice();
        kangaroo.voice();
        dragonfly.voice();

        System.out.println();

        for (Animal animal: herd) {
            animal.move();
        }
        horse.move();
        kangaroo.move();
        dragonfly.move();

        System.out.println();

        for (Animal animal: herd) {
            animal.isHungry();
        }
        horse.isHungry();
        kangaroo.isHungry();
        dragonfly.isHungry();
    }
}
