# S3.01.Patterns1.Lv3

# 🚗 Vehicle Parking System using Command Pattern

### 📄 Description – Exercise Statement
This exercise implements the Command design pattern to model a vehicle parking system that allows interaction with different vehicle types in a decoupled and extensible way.

The application is structured around the following components:

Vehicle: the interface that defines the basic operations every vehicle must support (start, accelerate, brake).

Concrete Vehicles: classes such as Car, Bicycle, Airplane, and Boat, each implementing the Vehicle interface with their own behavior.

Command Interface: defines the execute() method.

Concrete Commands: StartCommand, AccelerateCommand, and BrakeCommand encapsulate actions to perform on a specific vehicle.

VehicleController: the Invoker that triggers the execution of commands without knowing the internal logic of the receiver.

Main: the entry point that demonstrates how to control multiple types of vehicles using the command pattern.

Summary of the exercise statement:
Create a system that manages 4 different vehicles (car, bike, airplane, boat) and performs actions like starting, accelerating, and braking using the Command pattern. The pattern helps to decouple the sender of a request (controller) from the object that performs the action (vehicle).

### 💻 Technologies Used

🧠 Java 17 (or later)
🔨 Gradle (project build and dependency management)
💡 IntelliJ IDEA as the development environment
☕ JDK (Java Development Kit)
📦 Java Standard Library
🔗 Git and GitHub for version control

### 📋 Requirements
Java 17 or higher installed

IntelliJ IDEA (recommended)

Gradle (bundled with IntelliJ or installed separately)

GitHub account (to clone or fork the repository)

### 🛠️ Installation
Open the project in IntelliJ IDEA:

Go to File > Open... and select the vehicle-command-pattern project folder.

Wait for Gradle to sync.

Make sure the correct JDK is set:

Go to File > Project Structure > Project SDK → Java 17+

Build the project via Build > Build Project

### ▶️ Running the Project
Once the project is open in IntelliJ:

Open Main.java.

Click the green Run button (or press Ctrl+Shift+F10) to start the program.

### 🧪 Sample Flow
Each vehicle (Car, Bike, Airplane, Boat) is instantiated.

For each vehicle, three commands are created:

StartCommand

AccelerateCommand

BrakeCommand

These commands are assigned to a VehicleController.

The controller calls each command in sequence.

The output shows the specific behavior of each vehicle.

### 📦 Output Example

```
--- Car ---
Car is starting.
Car is accelerating.
Car is braking.

--- Bike ---
Bicycle is ready to go.
Bicycle is pedaling faster.
Bicycle is braking.

--- Airplane ---
Airplane engines are starting.
Airplane is accelerating on runway.
Airplane is reducing speed.

--- Boat ---
Boat engine is starting.
Boat is speeding up.
Boat is slowing down.
```

### 🌐 Deployment
This project is for educational and console use only.

To create a .jar file for deployment:

Go to File > Project Structure > Artifacts

Create a new JAR artifact from the Gradle build output

Use Build > Build Artifacts to compile it

To run the JAR from terminal:

```
java -jar vehicle-command.jar
```

### 🤝 Contributing
All contributions are welcome! To contribute:
Marc, Ana, Javier, Albert, Alvaro, Ignasi, Vanina, Meritxell and Adrià.

### 🔗Git Hub link:

```
https://github.com/ArnauAsole/S3.01.Patterns1.Lv3.git
```
