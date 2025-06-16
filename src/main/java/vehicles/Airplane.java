package vehicles;

public class Airplane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Airplane engines are starting.");
    }
    @Override
    public void accelerate() {
        System.out.println("Airplane is accelerating on runway.");
    }
    @Override
    public void brake() {
        System.out.println("Airplane is reducing speed.");
    }
}