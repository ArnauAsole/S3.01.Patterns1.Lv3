package controller;

import commands.Command;

public class VehicleController {
    private Command startCommand;
    private Command accelerateCommand;
    private Command brakeCommand;

    public VehicleController(Command start, Command accelerate, Command brake) {
        this.startCommand = start;
        this.accelerateCommand = accelerate;
        this.brakeCommand = brake;
    }

    public void pressStart() {
        startCommand.execute();
    }

    public void pressAccelerate() {
        accelerateCommand.execute();
    }

    public void pressBrake() {
        brakeCommand.execute();
    }
}