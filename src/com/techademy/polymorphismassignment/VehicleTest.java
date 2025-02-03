package com.techademy.polymorphismassignment;

class Vehicle {
    public void startEngine() {
        System.out.println("The vehicle's engine is starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starting with a push-button ignition.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starting with a self-start or kickstart.");
    }
}

public class VehicleTest {
	
	public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

	public static void main(String[] args) {
		 Vehicle myCar = new Car();
	     Vehicle myBike = new Motorcycle();

	     System.out.println("Testing Car:");
	     vehicleTestDrive(myCar);
	        
	     System.out.println("\n");

	     System.out.println("Testing Motorcycle:");
	     vehicleTestDrive(myBike);
		
	}
}
