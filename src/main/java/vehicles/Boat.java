package vehicles;

public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("Boat engine is starting.");
    }
    @Override
    public void accelerate() {
        System.out.println("Boat is speeding up.");
    }
    @Override
    public void brake() {
        System.out.println("Boat is slowing down.");
    }
}