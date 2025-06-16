package main;

import commands.AccelerateCommand;
import commands.BrakeCommand;
import commands.StartCommand;
import controller.VehicleController;
import vehicles.*;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bike();
        Vehicle airplane = new Airplane();
        Vehicle boat = new Boat();

        VehicleController carController = new VehicleController(
                new StartCommand(car),
                new AccelerateCommand(car),
                new BrakeCommand(car)
        );

        VehicleController bicycleController = new VehicleController(
                new StartCommand(bicycle),
                new AccelerateCommand(bicycle),
                new BrakeCommand(bicycle)
        );

        VehicleController airplaneController = new VehicleController(
                new StartCommand(airplane),
                new AccelerateCommand(airplane),
                new BrakeCommand(airplane)
        );

        VehicleController boatController = new VehicleController(
                new StartCommand(boat),
                new AccelerateCommand(boat),
                new BrakeCommand(boat)
        );

        System.out.println("--- Car ---");
        carController.pressStart();
        carController.pressAccelerate();
        carController.pressBrake();

        System.out.println("\n--- Bike ---");
        bicycleController.pressStart();
        bicycleController.pressAccelerate();
        bicycleController.pressBrake();

        System.out.println("\n--- Airplane ---");
        airplaneController.pressStart();
        airplaneController.pressAccelerate();
        airplaneController.pressBrake();

        System.out.println("\n--- Boat ---");
        boatController.pressStart();
        boatController.pressAccelerate();
        boatController.pressBrake();
    }
}