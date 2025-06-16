package vehicles;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is ready to go.");
    }
    @Override
    public void accelerate() {
        System.out.println("Bicycle is pedaling faster.");
    }
    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }
}