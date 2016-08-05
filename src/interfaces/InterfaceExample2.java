package interfaces;

public class InterfaceExample2 {

	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print(); // This will call print method from car

		Vehicle scooter = new Scooter();
		scooter.print(); // Print method from Vehicle
		scooter.signal(); // Signal method from TwoWheeler interface
	}

}

interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {
		System.out.println("Blowing horn from Vehicle!!!");
	}

	default void signal() {
		System.out.println("Signal from Vehicle");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

interface TwoWheeler extends Vehicle {
	@Override
	public default void signal() {
		System.out.println("Signal from TwoWheeler");
	}
}

class Car implements Vehicle, FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}

class Scooter implements Vehicle, TwoWheeler {

	void blowHorn() {
		System.out.println("Blowing Horn from TwoWheeler");
	}
}